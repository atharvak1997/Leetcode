class Solution {
        HashMap<Integer, Boolean> hashmap = new HashMap<>();
        public boolean validPartition(int[] nums) {
            hashmap.put(-1, true);
            return dfs(nums, nums.length - 1);
    }
        boolean dfs(int[] nums, int i) {
            boolean res = false;
            if(hashmap.containsKey(i)) {
                return hashmap.get(i);
            }
            
            if(i > 0 && nums[i] == nums[i - 1]) {
                res = res || dfs(nums, i - 2);
            }
            
            if(i > 1 && nums[i] - 1 == nums[i - 1] && nums[i - 1] - 1 == nums[i - 2]) {
                res = res || dfs(nums, i - 3);
            }
            
            if(i > 1 && nums[i] == nums[i - 1] && nums[i - 1] == nums[i - 2]) {
                res = res || dfs(nums, i - 3);
            }
            
            hashmap.put(i, res);
            return res;
        }
}