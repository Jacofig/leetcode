class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> setNums = new HashSet<>();

        for(int num : nums)
        {
            setNums.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++){
            if (!setNums.contains(i))
                {
                    result.add(i);
                }
        }
        return result;

    }
}