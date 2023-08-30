class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int buy = 0;
        int sell = 1;
        
        while(sell < prices.length) {
            if(prices[sell] < prices[buy]) {
                buy = sell;
            }
            else {
                maxP = Math.max(maxP, prices[sell] - prices[buy]);
                sell++;
            }
        }
        
        
        return maxP;
    }
}