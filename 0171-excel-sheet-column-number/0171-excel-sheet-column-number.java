class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length() - 1;
        int i = 0;
        int sumE = 0;
        
        while(n >= 0) {
            sumE += Math.pow(26, i)*(columnTitle.charAt(n) - 64);
            n--;
            i++;
        }        
        return sumE;
    }
}