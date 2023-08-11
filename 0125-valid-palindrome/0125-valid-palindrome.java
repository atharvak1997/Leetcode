class Solution {
    public boolean isPalindrome(String s) {
        String newS = "";
        String revS = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                newS += Character.toLowerCase(s.charAt(i));   
            }
        }
        for(int i = 0; i < newS.length(); i++) {
            revS = newS.charAt(i) + revS;
        }
        return newS.equals(revS);
    }
}