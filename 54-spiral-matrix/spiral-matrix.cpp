class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        int firstRow = 0;
        int lastRow  = matrix.size() - 1;
        int firstCol = 0;
        int lastCol  = matrix[0].size() - 1;

        while (firstRow <= lastRow && firstCol <= lastCol) {
            // top row
            for (int i = firstCol; i <= lastCol; i++)
                result.push_back(matrix[firstRow][i]);
            firstRow++;
            // right col
            for (int i = firstRow; i<= lastRow; i++)
                result.push_back(matrix[i][lastCol]);
            lastCol--;

            // bottom row
            if (firstRow <= lastRow)
            {
                for (int i = lastCol; i >= firstCol; i--)
                    result.push_back(matrix[lastRow][i]);
                lastRow--;
            }
           
            // left col
            if (firstCol <= lastCol)
            {
                for (int i = lastRow; i >= firstRow; i--)
                    result.push_back(matrix[i][firstCol]);
                firstCol++;
            }      
        }
        return result;
    }
};