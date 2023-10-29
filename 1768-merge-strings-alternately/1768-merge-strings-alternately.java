class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringB = new StringBuilder();
        int w1 = 0;
        int w2 = 0;
        boolean word = true;

        while(w1 < word1.length() && w2 < word2.length()) {
            if(word == true) {
                stringB.append(word1.charAt(w1));
                w1++;
                word = false;
            }
            else {
                stringB.append(word2.charAt(w2));
                w2++;
                word = true;
            }
        }

        while(w1 < word1.length()) {
            stringB.append(word1.charAt(w1));
            w1++;
        }
        while(w2 < word2.length()) {
            stringB.append(word2.charAt(w2));
            w2++;
        }
        
        String answer = stringB.toString();
        return answer;
    }
}