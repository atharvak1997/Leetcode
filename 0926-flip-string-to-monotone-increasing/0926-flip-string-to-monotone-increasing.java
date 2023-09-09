class Solution {
    public int minFlipsMonoIncr(String s) {
        int c1 = 0;
        int c0 = 0;
        
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
                    if(ch[i] == '1') {
                        c1++;
                    }
                    else if(c1 > 0) {
                        c0++;
                        c1--;
                    }
            }
                return c0;

        }
}