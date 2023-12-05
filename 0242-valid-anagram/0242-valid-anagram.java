class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            maps.merge(ch, 1, Integer::sum);
        }

        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            mapt.merge(ch, 1, Integer::sum);
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!maps.get(ch).equals(mapt.get(ch))) {
                return false;
            }
        } 


        return true; 
    }

}