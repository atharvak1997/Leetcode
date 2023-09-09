class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        cs(nums, target, dp);
        return dp[target];
        
    }
    
    int cs(int[] nums, int target, int[] dp) {
        if(dp[target] > -1) return dp[target];
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= target) {
                count += cs(nums, target - nums[i], dp);    
            }
        }
        dp[target] = count;
        return count;
    }
}