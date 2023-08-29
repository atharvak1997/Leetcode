class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        
        while(m != 0 && n != 0) {
            if(nums1[m - 1] >= nums2[n - 1]) {
                nums1[i] = nums1[m - 1];
                m--;
            }
            else {
                nums1[i] = nums2[n - 1];
                n--;
            }
            i--;
        }
        if(m > 0) {
            while(i >= 0) {
                nums1[i] = nums1[m - 1];
                i--;
                m--;
            }
        }

        if(n > 0) {
            while(i >= 0) {
                nums1[i] = nums2[n - 1];
                i--;
                n--;
            }
        }
        System.out.println(nums1);
    }
}