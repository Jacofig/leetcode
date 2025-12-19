class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> sorted = nums;
        sort(sorted.begin(), sorted.end());
        unordered_map<int, int> smaller;
        vector<int> result;

        for (int i = 0; i< sorted.size(); i++)
        {
            if (!smaller.count(sorted[i]))
                smaller[sorted[i]] = i;
        }
        
        for (int num: nums)
        {
            result.push_back(smaller[num]);
        }
        return result;
    }
};