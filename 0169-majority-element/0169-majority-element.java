class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int n = nums.length;
        
        for(int num : nums) {
            hashmap.merge(num, 1, Integer::sum);
        }
        
        for(Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if(entry.getValue() > (n / 2)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}