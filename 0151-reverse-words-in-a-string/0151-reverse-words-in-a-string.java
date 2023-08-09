class Solution {
    public String reverseWords(String s) {
        String output = "";
        
        String[] words = s.trim().split("\\s+");
        for(int i = words.length - 1; i >= 0; i--) {
            if(i != 0){
                output = output + words[i] + " ";    
            }
            else if(i == 0){
                output = output + words[i];
            }
            
        }
        
        return output;
    }
}