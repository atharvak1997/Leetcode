class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxVal = 0;
        int total = 0;
        
        for(int i : nums) {
            if(i > maxVal) {
                maxVal = i;
            }
        }
        // System.out.println(maxVal);
        while(k != 0) {
            total = total + maxVal;
            maxVal += 1;
            k--;
        }
        
        return total;
    }
}