class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arrlist = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                arrlist.add(Character.toLowerCase(s.charAt(i)));
            }
        }

        int l = 0, r = arrlist.size() - 1;
        while(l < r) {
            if(!arrlist.get(l).equals(arrlist.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        
        return true;
    }
}