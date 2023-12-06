class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;
            while(l < r) {
                int threeSum = nums[i] + nums[l] + nums[r];
                List<Integer> temp = new ArrayList<>();

                if(threeSum < 0) {
                    l++;
                }
                else if(threeSum > 0) {
                    r--;
                }
                else {
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    answer.add(temp);
                    l++;
                    while(l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return answer;
    }
}