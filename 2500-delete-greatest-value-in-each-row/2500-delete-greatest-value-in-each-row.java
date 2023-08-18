class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        int Indi = 0;
        int Indj = 0;
        int rep = grid[0].length;
        int tempval = Integer.MIN_VALUE;
        
        
        while(rep != 0){
                for(int i = 0; i < grid.length; i++) 
                {
                    int maxVal = Integer.MIN_VALUE;
                    for(int j = 0; j < grid[0].length; j++) {
                        if(grid[i][j] > maxVal) {
                            maxVal = grid[i][j];
                            Indi = i;
                            Indj = j;
                        }
                        tempval = Math.max(tempval, maxVal);
                    }
                    grid[Indi][Indj] = -1;
            }
            sum += tempval;
            
            tempval = 0;
            rep--;
            
        }
        
        return sum;
    }
}