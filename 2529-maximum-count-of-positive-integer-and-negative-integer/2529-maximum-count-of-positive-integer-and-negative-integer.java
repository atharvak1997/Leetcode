class Solution {
    public int maximumCount(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int neg = 0;
        int pos = 0;

        while(l <= r) {
            int mid = (l + r) / 2;
            System.out.println(mid);

            if(nums[mid] < 0) {
                neg = mid + 1;
                l = mid + 1;
            }
            else if(nums[mid] > 0) {
                pos = nums.length - mid;
                r = mid - 1;
            }
            else {
                while(mid >= 0 && nums[mid] == 0) {
                    mid--;
                }
                neg = mid + 1;
                mid++;
                while(mid < nums.length && nums[mid] == 0) {
                    mid++;
                }
                pos = nums.length - mid;

                return Math.max(neg, pos);
            }
        }

        return Math.max(neg, pos);
    }
}