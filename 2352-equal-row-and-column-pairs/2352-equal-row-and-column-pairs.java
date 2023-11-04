class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        int count = 0;

        for(int[] n : grid) {
            hashmap.put(Arrays.toString(n), 1 + hashmap.getOrDefault(Arrays.toString(n), 0));
        }

        for(int c = 0; c < grid[0].length; c++) {
            int[] colElem = new int[grid.length];
            for(int r = 0; r < grid.length; r++) {
                colElem[r] = grid[r][c];
                
            }
            count += hashmap.getOrDefault(Arrays.toString(colElem), 0);
            // System.out.println(newString);
        }
        
        return count;
    }
}