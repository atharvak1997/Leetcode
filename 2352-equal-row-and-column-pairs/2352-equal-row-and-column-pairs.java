class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        int count = 0;
        
        for(int[] n : grid) {
            String rowString = Arrays.toString(n);
            hashmap.put(rowString, 1 + hashmap.getOrDefault(rowString, 0));
        }

        for(int c = 0; c < grid.length; c++) {
            int[] colarray = new int[grid.length];
            for(int r = 0; r < grid.length; r++) {
                colarray[r] = grid[r][c];
            }
            count += hashmap.getOrDefault(Arrays.toString(colarray), 0);
        }
        return count;
    }
}