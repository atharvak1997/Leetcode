class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sp = s.split(" ");
        HashMap<String, String> hashmap = new HashMap<>();
        if(pattern.length() != sp.length) return false;
        
        for(int i = 0; i < sp.length; i++) {
            String a = String.valueOf(pattern.charAt(i));
            String b = sp[i];
            
            if(hashmap.containsKey(a)) {
                if(hashmap.get(a).equals(b)) {
                    continue;
                }
                else return false;
            }
            else {
                if(!hashmap.containsValue(b)) hashmap.put(a, b);
                else return false;
            }
        }
        

        return true;
    }
}