class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = 0;
        List<Boolean> answer = new ArrayList<>();

        for(int i = 0; i < candies.length; i++) {
            maxValue = Math.max(maxValue, candies[i]);
        }

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maxValue) {
                answer.add(true);
            }
            else {
                answer.add(false);
            }
        }

        return answer;
    }
}