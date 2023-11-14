class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0;
        int res = 0;

        for(int r = 0; r < s.length(); r++) {
            hm.merge(s.charAt(r), 1, Integer::sum);

            if(r - l + 1 - Collections.max(hm.values()) > k) {
                hm.put(s.charAt(l), hm.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, (r - l + 1));
        }
        return res;

    }
}