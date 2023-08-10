class Solution {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int maxTotal = nums[0];
        
        if(nums.length == 1) {
            return nums[0];
        }
        
        for(int i : nums) {
            if(total < 0) {
                total = 0;
            }
            total += i;
            maxTotal = Math.max(maxTotal, total);
        }
        System.out.println(maxTotal);
        return maxTotal;
    }
}