class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashset = new HashMap<>();
        
        for(int i : nums) {
            hashset.merge(i, 1, Integer::sum);
        }
        for(int i : nums) {
            int num = hashset.get(i);
            if(num > nums.length/2) {
                return i;
            }
        }
        return 1;
    }
}