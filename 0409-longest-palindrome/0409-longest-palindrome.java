class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int oddC = 0;
        int evenC = 0;
        
        for(int i = 0; i < s.length(); i++) {
            Integer count = hm.get(s.charAt(i));
            if(count == null) {
                hm.put(s.charAt(i), 1);
            }
            else {
                hm.put(s.charAt(i), count + 1);
            }
        }
        for(Object m : hm.values()) {
            if((int)m % 2 != 0) {
                    oddC++;
                
            }
        }
        // System.out.println(oddC);
        // System.out.println(evenC);
        int n = s.length();
        System.out.println(hm);
        return s.length() - oddC + (oddC > 0 ? 1 : 0);
    }
}