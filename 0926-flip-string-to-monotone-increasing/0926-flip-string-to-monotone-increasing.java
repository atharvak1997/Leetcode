class Solution {
    public int minFlipsMonoIncr(String s) {
        int ans = 0, num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                num++;
            } else {
                ans = Math.min(num, ans + 1);
            }
        }
        return ans;
    }
}