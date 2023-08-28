class Solution {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int maxT = nums[0];
        
        if(nums.length == 1) {
            return nums[0];
        }
        
        for(int i : nums) {
            if(total < 0) {
                total = 0;
            }
            total += i;
            maxT = Math.max(total, maxT);    
        }
        
        return maxT;
    }
}