class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> sortedvowels = new ArrayList<>();
        String res = "";
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'));
        
        for(int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
                sortedvowels.add(s.charAt(i));
            }
        }
        
        Collections.sort(sortedvowels);
        
        StringBuilder sb = new StringBuilder();
        
        int m = 0;
        for(int j = 0; j < s.length(); j++) {
            if(vowels.contains(s.charAt(j))) {
                sb.append(sortedvowels.get(m));
                m++;
            }
            else {
                sb.append(s.charAt(j));
            }
        }
        String finalres = sb.toString();
        
        return finalres;
    }
}