class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> t1 = new HashMap<>();
        
        if(s.length() != t.length()) {
            return false;
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(!s1.containsKey(s.charAt(i))) {
                s1.put(s.charAt(i), 1);
            }
            else {
                s1.put(s.charAt(i), s1.get(s.charAt(i)) + 1);
            }
        }
        
        for(int i = 0; i < t.length(); i++) {
            if(!t1.containsKey(t.charAt(i))) {
                t1.put(t.charAt(i), 1);
            }
            else {
                t1.put(t.charAt(i), t1.get(t.charAt(i)) + 1);
            }
        }
        System.out.println(s1);
        System.out.println(t1);
        return s1.equals(t1);
    }
}