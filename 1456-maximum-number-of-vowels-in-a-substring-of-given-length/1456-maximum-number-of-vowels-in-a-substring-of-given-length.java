class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');

        int count = 0;
        for(int i = 0; i < k; i++) {
            if(vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        int maxC = count;

        int start = 0;
        int end = k - 1;
        while(end < s.length() - 1) {
            if(vowels.contains(s.charAt(start))) {
                count--;
            }
            start++;

            end++;
            if(vowels.contains(s.charAt(end))) {
                count++;
            }

            maxC = Math.max(maxC, count);
        }

        return maxC;
    }

    
}