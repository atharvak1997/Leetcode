class Solution {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return checkValid(s, start + 1, end) || checkValid(s, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }
    
    public boolean checkValid(String str, int start, int end) {
        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    
}