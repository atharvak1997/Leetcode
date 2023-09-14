class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while(l <= r) {
            int mid = (r + l) / 2;
            System.out.println(mid);
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if(arr[mid] < arr[mid - 1]) r--;
            else if(arr[mid] < arr[mid + 1]) l++;
        }

        return -1;
    }    
}