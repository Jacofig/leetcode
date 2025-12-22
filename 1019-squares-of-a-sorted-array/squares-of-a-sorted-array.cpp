class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int l = 0;
        int r = nums.size()-1;
        int pos = nums.size()-1;
        vector<int> result(nums.size());

        while (l <= r)
        {
            int left = abs(nums[l]);
            int right = abs(nums[r]);
            
            if (left > right)
            {
                result[pos--] = left*left;
                l++;
            }
            else{
                result[pos--] = right*right;
                r--;
            }
        }
        return result;
    }
};