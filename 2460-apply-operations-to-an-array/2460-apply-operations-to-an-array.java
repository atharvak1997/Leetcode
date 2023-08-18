class Solution {
    public int[] applyOperations(int[] nums) {
        int count = 0;
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            if(i + 1 < nums.length && nums[i] == nums[i + 1]) {
                nums[i] = nums[i]*2;
                nums[i + 1] = 0;
            }
        }
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }
            else {
                res[j] = nums[i];
                j++;
            }
        }
        return res;
    }
}