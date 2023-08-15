class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int ans = 0;
        int count = 0;

        for(int num : nums) {
            hashmap.merge(num, 1, Integer::sum);
        }

        for(Map.Entry<Integer, Integer> map : hashmap.entrySet()) {
            if(map.getValue()*2 > nums.size()) {
                ans = map.getKey();
                count = map.getValue();
                break;
            }
        }

        int precount = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == ans) {
                precount++;
                count--;
            }
            if(precount > (i+1) / 2 && count > (nums.size() - i - 1) / 2) {
                return i;
            }
        }
        return -1;
    }
}