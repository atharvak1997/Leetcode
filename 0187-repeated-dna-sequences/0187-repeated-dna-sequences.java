class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> hashset = new HashSet<>();
        List<String> res = new ArrayList<>();
        
        for(int i = 0; i < s.length() - 9; i++) {
            String str = s.substring(i, i+10);
            if(hashset.contains(str)) {
                if(!res.contains(str)) {
                    res.add(str);
                }
            }
            hashset.add(str);
        }
        
        return res;
        
        
    }
}