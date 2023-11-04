class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a = modify(s);
        String b = modify(t);

        return a.equals(b);
    }

    public String modify(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '#') {
                if(!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }  
            }
            else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}