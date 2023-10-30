class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int third : nums) {
            if(third <= first) {
                first = third;
            }
            else if(third <= second) {
                second = third;
            }
            else{
                return true;
            }
        }
        return false;
    }
}