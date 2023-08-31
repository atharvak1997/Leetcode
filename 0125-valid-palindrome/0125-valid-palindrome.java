class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        String reverse = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                str += Character.toLowerCase(s.charAt(i));
            }
        }
        
        for(int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);
        System.out.println(str);
        return reverse.equals(str);
    }
}