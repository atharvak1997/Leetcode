class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        nums = reverse(nums, 0, nums.length - 1);
        nums = reverse(nums, 0, k - 1);
        nums = reverse(nums, k, nums.length - 1);

        // return nums;
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