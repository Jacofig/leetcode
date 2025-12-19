class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> missing;
        unordered_set<int> set_nums;

        for (int num : nums)
        {
            set_nums.insert(num);
        }

        for (int i = 1; i <= nums.size(); i++ )
        {
            if (!set_nums.contains(i))
                missing.push_back(i);
        }
        return missing;
    }
};