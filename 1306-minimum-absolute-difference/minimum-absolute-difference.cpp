class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
        vector<int> sorted = arr;
        sort(sorted.begin(), sorted.end());
        int minDiff = INT_MAX;
        vector<vector<int>> solution;

        for (int i = 0; i < arr.size()-1; i++)
        {
            minDiff = std::min(minDiff, sorted[i+1] - sorted[i]);
        }

        for (int i = 0; i < sorted.size() - 1; i++)
        {
            if (sorted[i+1] - sorted[i] == minDiff)
                solution.push_back({sorted[i], sorted[i+1]});
        }


        return solution;
    }
};