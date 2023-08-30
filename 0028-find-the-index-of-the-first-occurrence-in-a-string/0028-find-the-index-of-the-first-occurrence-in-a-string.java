class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = needle.length();
        while(j <= haystack.length()) {
            String s = haystack.substring(i,j);
            System.out.println(s);
            System.out.println(needle);
            if(s.equals(needle)) {
                return i;
            }
            i++;
            j++;
        }
        
        return -1;
    }
}