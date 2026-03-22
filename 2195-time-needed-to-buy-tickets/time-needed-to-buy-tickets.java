class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < tickets.length; i++)
        {
            q.offer(new int[]{tickets[i], i});
        }

        while (true) {
            int[] current = q.poll();
            current[0]--;
            time++;

            if (current[1] == k && current[0] == 0) {
                return time;
            }

            if (current[0] > 0){
                q.offer(current);
            }
        }
    }
}