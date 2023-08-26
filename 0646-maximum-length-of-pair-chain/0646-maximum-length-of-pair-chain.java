class Solution {
    public int findLongestChain(int[][] pairs) {
        int maxC = 0;
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        
        int compare = Integer.MIN_VALUE;
        for(int[] pair : pairs) {
            System.out.println(pair[1]);
        }

        for(int i = 0; i < pairs.length; i++){
            // compare = pairs[i];
            // int count = 1;
            for(int j = 0; j < pairs.length; j++) {
                if(compare < pairs[j][0]) {
                    compare = pairs[j][1];
                    maxC++;
                }
            }
            // maxC = Math.max(maxC, count);
        }

        return maxC;
    }
}