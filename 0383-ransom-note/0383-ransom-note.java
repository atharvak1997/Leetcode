class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ranh = new HashMap<>();
        HashMap<Character, Integer> magh = new HashMap<>();  
        
        for(int i = 0; i < ransomNote.length(); i++) {
            ranh.merge(ransomNote.charAt(i), 1, Integer::sum);
        }
        for(int i = 0; i < magazine.length(); i++) {
            magh.merge(magazine.charAt(i), 1, Integer::sum);
        }
        
        for(int i = 0; i < ransomNote.length(); i++) {
            if(!magh.containsKey(ransomNote.charAt(i)))          {
               return false; 
            }
            if(!(magh.get(ransomNote.charAt(i)) >= ranh.get(ransomNote.charAt(i)))) {
                return false;
            }
        }
        
        return true;
    }
}