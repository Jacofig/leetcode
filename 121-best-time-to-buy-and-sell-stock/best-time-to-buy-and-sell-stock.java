class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowest = prices[0];
        for(int i = 0; i < prices.length; i++)
        {
            lowest = Math.min(lowest, prices[i]);
            profit = Math.max(profit, prices[i] - lowest);
        }
        return profit;
    }
}