class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        int count = 0;
        int m = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
        StringBuilder sbr = sb.reverse();
        
        for(int i = 0; i < s.length(); i++) {
            if(!Character.isAlphabetic(s.charAt(i))) {
                while(count > 0) {
                    sb1.append(sbr.charAt(m));
                    m++;
                    count--;
                }
                sb1.append(s.charAt(i));
                count = 0;
            }
            else {
                count++;
            }
        }
        
        while(count > 0) {
            sb1.append(sb.charAt(m));
            m++;
            count--;
        }
        String result = sb1.toString();
        return result;
    }
}