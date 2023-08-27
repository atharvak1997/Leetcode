class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int dominant = 0;
        int count = 0;
        int precount = 0;
        
        for(int num : nums) {
            hm.merge(num, 1, Integer::sum);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue()*2 > nums.size()) {
                dominant = entry.getKey();
                count = entry.getValue();
            }
        }
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == dominant) {
                count--;
                precount++;
            }
            if((precount*2) > (i+1) && count*2 > nums.size() - i - 1) {
                return i;
            }
        }        
        return -1;
    }
}