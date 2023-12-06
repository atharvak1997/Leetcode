class Solution {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int MaxTotal = nums[0];

        for(int i : nums) {
            if(total < 0) {
                total = 0;
            }

            total += i;
            MaxTotal = Math.max(MaxTotal, total);
        }

        return MaxTotal;
    }
}