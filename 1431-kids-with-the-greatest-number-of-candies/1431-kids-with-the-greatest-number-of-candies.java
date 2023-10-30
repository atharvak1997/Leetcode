class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = 0;
        List<Boolean> result = new ArrayList<>();

        for(int i = 0; i < candies.length; i++) {
            maxValue = Math.max(maxValue, candies[i]);
        }

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maxValue) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }

        return result;
    }
}