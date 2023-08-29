class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int left = 0;
        int right = nums.length - 1;
        nums = reverse(nums, left, right);
        nums = reverse(nums, left, k - 1);
        nums = reverse(nums, k, right);
        
        
    }
    int[] reverse(int[] nums, int l, int r) {
            while(l <= r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        return nums;
        }
}