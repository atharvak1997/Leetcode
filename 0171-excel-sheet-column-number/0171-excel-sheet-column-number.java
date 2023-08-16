class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length() - 1;
        int sumE = 0;
        int i = 0;
        
        while(n >= 0) {
            char c = columnTitle.charAt(n);
            sumE += Math.pow(26, i)*(c - 64);
            n--;
            i++;
        }
        
        return sumE;
    }
}