class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> shash = new HashMap<>();
        HashMap<Character, Integer> thash = new HashMap<>();
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        
        for(char ch : chs) {
            shash.merge(ch, 1, Integer::sum);
        }
        for(char ch : cht) {
            thash.merge(ch, 1, Integer::sum);
        }
        
        for(Map.Entry<Character, Integer> entry : thash.entrySet()) {
            if(!shash.containsKey(entry.getKey()) || shash.get(entry.getKey()) != entry.getValue()) {
                return entry.getKey();
            }
        }
        
        return 'a';
    }
}