class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        TreeSet<Integer> set = new TreeSet<>();
        int result = Integer.MAX_VALUE;

        for (int i = x; i < nums.size(); i++)
        {
            set.add(nums.get(i-x));
            int current = nums.get(i);
            Integer ceil = set.ceiling(current);
            if (ceil != null) {
                result = Math.min(result, Math.abs(ceil - current));
            }
            Integer floor = set.floor(current);
            if (floor != null) {
                result = Math.min(result, Math.abs(floor - current));
            }
        }
        return result;
    }
}