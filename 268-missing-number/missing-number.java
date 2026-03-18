class Solution {
    public int missingNumber(int[] nums) {
        int targetSum = 0;
        int realSum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            realSum += nums[i];
            targetSum += i;
        }
        targetSum += nums.length;
        return targetSum - realSum;
    }
}