class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        Arrays.sort(nums);
        
        while (i < nums.length) {
            if(i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i += 2;
            }
            else {
                list.add(nums[i]);
                i += 1;
            }
        }
        
        int[] arr = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++) {
            arr[j] = list.get(j);
        }        
        return arr;
    }
}