class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> existing;
        for (int n : nums)
        {
            if (existing.contains(n))
                return true;
            existing.insert(n);
            
        }
        return false;

    }
};