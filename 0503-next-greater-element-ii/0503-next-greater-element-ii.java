class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int range = nums.length;
        int[] arr = new int[range];
        Arrays.fill(arr, Integer.MIN_VALUE);
        
        for(int i = 0; i < range; i++) {
            for(int j = i; j < range; j++) {
                if(nums[j] > nums[i]) {
                    arr[i] = nums[j];
                    break;
                }
            }
            if(arr[i] == Integer.MIN_VALUE) {
                int m = 0;
                while(m < i) {
                    if(nums[m] > nums[i]) {
                        arr[i] = nums[m];
                        break;
                    }
                    m++;
                }
            }
        }

        for(int k = 0; k < range; k++) {
            if(arr[k] == Integer.MIN_VALUE) {
                arr[k] = -1;
            }
        }
        return arr;
    }
}