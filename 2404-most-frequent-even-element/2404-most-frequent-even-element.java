class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int maxValue = -1;
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i : nums) {
            if(i % 2 == 0) {
                hashmap.merge(i, 1, Integer::sum);
            }
        }
        if(hashmap.isEmpty()) {
            return -1;
        }
        for(int key : hashmap.keySet()) {
            int count = hashmap.get(key);
            maxValue = Math.max(maxValue, count);
        }
        int res = Integer.MAX_VALUE;
        for(int key : hashmap.keySet()) {
            if(hashmap.get(key) == maxValue) {
                res = Math.min(res, key);
            }
        }
        return res;
    }
}