class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 1;
        int l = 0;
        int r = 1;

        if(s.isEmpty()) {
            return 0;
        }

        while(r < s.length()) {
            if(inSubstring(l, r, s)) {
                l++;
            }
            else {
                r++;
                maxLength = Math.max(maxLength, r - l);
            }
        }

        return maxLength;
    }

    public Boolean inSubstring(int l, int r, String s) {
        for(int i = l; i < r; i++) {
            if(s.charAt(i) == s.charAt(r)) {
                return true;
            }
        }

        return false;
    }
}