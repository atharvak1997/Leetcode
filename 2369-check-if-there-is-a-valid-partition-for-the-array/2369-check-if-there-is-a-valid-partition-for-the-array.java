class Solution {
    HashMap<Integer, Boolean> hm = new HashMap<>();
      
    boolean dfs(int i, int[] nums) {       
        if(hm.containsKey(i)) {
            return hm.get(i);
        }
        boolean res = false;

        if(i > 0 && nums[i] == nums[i - 1]) {
            res = res || dfs(i - 2, nums);
        }

        if(i > 1 && nums[i] == nums[i - 1] && nums[i - 1] == nums[ i - 2]) {
            res = res || dfs(i - 3, nums);
        }
        if(i > 1 && nums[i] - 1 == nums[i - 1] && nums[i - 1] - 1 == nums[ i - 2]) {
            res = res || dfs(i - 3, nums);
        }

        hm.put(i, res);
        return res;
    }
        public boolean validPartition(int[] nums) {

        hm.put(-1, true);
        return dfs(nums.length - 1, nums);
    }
    
}