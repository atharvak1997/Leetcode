class Solution {
    public int maxProfit(int[] prices) {
        int maxBuy = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i : prices) {
            if(i < maxBuy) {
                maxBuy = i;
            }
            
            if((i - maxBuy) >= maxProfit) {
                maxProfit = (i - maxBuy);
            }
        }
        return maxProfit;
    }
}