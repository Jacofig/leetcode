class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int expected = 0, actual = 0;

        for (int i = 0; i < nums.size(); i++)
        {
            expected += i;
            actual += nums[i];
        }

        expected += nums.size();

        return expected - actual;
    }
};