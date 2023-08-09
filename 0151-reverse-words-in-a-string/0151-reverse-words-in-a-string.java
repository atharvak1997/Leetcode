class Solution {
    public String reverseWords(String s) {
        String output = "";
        Stack<String> stack = new Stack<>();
        String[] words = s.trim().split("\\s+");
        
        for(String i : words) {
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            output = output + stack.pop() + " ";
        }
        return output.trim();
    }
}