class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashmap = new HashMap<>();
        
        
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if(hashmap.containsKey(a)) {
                if(hashmap.get(a).equals(b)) {
                    continue;
                }
                else {
                    return false;
                }
            }
            else {
                if(!hashmap.containsValue(b)) {
                    hashmap.put(a, b);
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}