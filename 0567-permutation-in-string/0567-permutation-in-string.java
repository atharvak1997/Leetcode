class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> hs1 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            hs1.merge(s1.charAt(i), 1, Integer::sum);
        }

        for(int i = 0; i < s2.length() - s1.length() + 1; i++) {
            String temp = s2.substring(i, i + s1.length());
            HashMap<Character, Integer> hs2 = new HashMap<>();
            for(int j = 0; j < temp.length(); j++) {
                hs2.merge(temp.charAt(j), 1, Integer::sum);
            }

            if(hs1.equals(hs2)) {
                return true;
            }
        }

        return false;
    }
}