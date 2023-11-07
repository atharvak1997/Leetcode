class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = k;
        double MaxAverage = 0;
        int sum = 0;

        for(int m = 0; m < k; m++) {
            sum += nums[m];
        }
        MaxAverage = sum;

        while(j < nums.length) {
            sum -= nums[i];
            i++;

            sum += nums[j];
            j++;
            
            MaxAverage = Math.max(MaxAverage, sum);
        }

        return MaxAverage/k;
    }
}