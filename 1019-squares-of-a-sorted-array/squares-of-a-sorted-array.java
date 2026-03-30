class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n-1;
        int fill = n-1;

        while (left <= right)
        {
            int leftVal = Math.abs(nums[left]);
            int rightVal = Math.abs(nums[right]);

            if (leftVal > rightVal)
            {
                result[fill] = leftVal*leftVal;
                left++;
                fill--;
            } else {
                result[fill] = rightVal*rightVal;
                right--;
                fill--;
            }
        }
        return result;
    }
}