class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer = m + n - 1;

        while (m > 0 && n > 0) {
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[pointer] = nums1[m - 1];
                m -= 1;
            }
            else {
                nums1[pointer] = nums2[n - 1];
                n -= 1;
            }
            pointer -= 1;
        }

        if(m > 0) {
            while ( pointer > 0) {
                nums1[pointer] = nums1[m - 1];
                pointer -= 1;
                m -= 1;
            }
        }

        if(n > 0) {
            while ( pointer >= 0) {
                nums1[pointer] = nums2[n - 1];
                pointer -= 1;
                n -= 1;
            }
        }
        // return nums1;
    }
}