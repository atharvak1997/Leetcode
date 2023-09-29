class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        
        for(int i = 1; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(num.charAt(0) == '0' && i > 1) {
                    break;
                }
                else if(num.charAt(i) == '0' && j > i + 1) {
                    break;
                }
                
                Long num1 = Long.parseLong(num.substring(0, i));
                Long num2 = Long.parseLong(num.substring(i, j));
                int k = j;
                
                while(k < n) {
                    Long num3 = num1 + num2;
                    
                    if(num.substring(k, n).startsWith(Long.toString(num3))) {
                        k += Long.toString(num3).length();
                        num1 = num2;
                        num2 = num3;
                    }
                    else{
                        break;
                    }
                }
                if(k == n) {
                    return true;
                }
            }
        }
        return false;
    }
}