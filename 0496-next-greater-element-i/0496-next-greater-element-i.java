class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        Arrays.fill(arr, -1);
        
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]) {
                    int m = j;
                    while(m < nums2.length) {
                        if(nums2[m] > nums1[i]) {
                            arr[i] = nums2[m];
                            break;
                        }
                        m++;
                    }
                } 
            }
        }
        return arr;
    }
}