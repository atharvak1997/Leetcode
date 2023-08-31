class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            char a = Character.toLowerCase(s.charAt(left));
            char b = Character.toLowerCase(s.charAt(right));
            
            if(!Character.isLetterOrDigit(a)) {
                left++;
            }
            else if(!Character.isLetterOrDigit(b)) {
                right--;
            }
            else {
                if(a != b) {
                    return false;
                }
                right--;
                left++;
            }
        }
        
        return true;
    }
}