class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int num = 0; num < nums.length; num++) {
            if(hashmap.containsKey(nums[num])) {
                if(Math.abs(hashmap.get(nums[num]) - num) <= k) {
                    return true;
                }
                else {
                    hashmap.put(nums[num], num);
                }
            }
            else {
                hashmap.put(nums[num], num);
            }
        }   
        return false;
    }
}