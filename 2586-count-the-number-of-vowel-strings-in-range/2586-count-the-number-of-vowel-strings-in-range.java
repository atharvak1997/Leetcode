class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowel = "a e i o u";
        
        for(int i = left; i <= right; i++){
            String[] w = words[i].split("");
            if(vowel.contains(w[0]) && vowel.contains(w[w.length - 1])){
                count++;
                System.out.println(count);
            }
        }
        
        return count;
    }
}