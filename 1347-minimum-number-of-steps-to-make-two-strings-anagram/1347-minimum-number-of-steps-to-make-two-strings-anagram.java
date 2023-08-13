class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> hmS = new HashMap<>();
        HashMap<Character, Integer> hmT = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            hmS.merge(s.charAt(i), 1, Integer::sum);
        }
        for(int i = 0; i < t.length(); i++) {
            hmT.merge(t.charAt(i), 1, Integer::sum);
        }
        
        for(Map.Entry<Character, Integer> me : hmS.entrySet()) {
            if(!hmT.containsKey(me.getKey())) {
                count += me.getValue();
            }
            else if(hmT.get(me.getKey()) < me.getValue()) {
                count = count + (me.getValue() - hmT.get(me.getKey()));
            }
        }
        System.out.println(count);
        return count;
    }
}