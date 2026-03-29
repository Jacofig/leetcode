class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int total = 0;
        for (int s : skill) total += s;
        int teams = n/2;
        if(total%teams!=0) return -1;
        int target = total/teams;

        long result = 0;
        int left = 0, right = n-1;
        while(left < right){
            if(skill[left] + skill[right] != target) return -1;
            result += (long) skill[left] * skill[right];
            left++;
            right--;
        }
        return result;
    }
}