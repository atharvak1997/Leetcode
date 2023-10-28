class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;

        while(i < nums.length) {
            int correctpos = nums[i] - 1;
            if(nums[i] != i + 1) {
                if(nums[correctpos] != nums[i]) {
                    int temp = nums[correctpos];
                    nums[correctpos] = nums[i];
                    nums[i] = temp;
                }
                else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }

        return -1;
    }
}