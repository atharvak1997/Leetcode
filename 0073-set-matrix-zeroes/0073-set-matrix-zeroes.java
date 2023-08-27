class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Pair<Integer, Integer>> hs = new HashSet<>();
        
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[0].length; col++) {
                if(matrix[row][col] == 0 && !hs.contains(new Pair<>(row, col))) {
                    for(int new_row = 0; new_row < matrix.length; new_row++) {
                        if(matrix[new_row][col] != 0) {
                            matrix[new_row][col] = 0;
                            hs.add(new Pair<>(new_row, col));
                        }
                    }
                    for(int new_col = 0; new_col < matrix[0].length; new_col++) {
                        if(matrix[row][new_col] != 0) {
                            matrix[row][new_col] = 0;
                            hs.add(new Pair<>(row, new_col));
                        }
                    }
                }
            }
        }
        
    }
}