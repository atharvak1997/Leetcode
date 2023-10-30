class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;

        if(s.length() > t.length()) {
            return false;
        }
        if(s.isEmpty()) {
            return true;
        }

        for(int i = 0; i < t.length(); i++) {
            if(sp < s.length() && s.charAt(sp) == t.charAt(i)) {
                sp++;
            }
        }

        if(sp >= s.length()) {
            return true;
        }
        return false;
    }
}