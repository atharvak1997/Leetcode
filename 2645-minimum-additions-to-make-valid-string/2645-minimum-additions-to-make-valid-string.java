class Solution {
    public int addMinimum(String word) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        
        for(int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        
        while(!stack.isEmpty()) {
            if(!stack.isEmpty() && stack.peek() == 'c') {
                stack.pop();
            }
            else {
                count++;
            }
            
            if(!stack.isEmpty() && stack.peek() == 'b') {
                stack.pop();
            }
            else {
                count++;
            }
            
            if(!stack.isEmpty() && stack.peek() == 'a') {
                stack.pop();
            }
            else {
                count++;
            }
        }
        
        return count;
    }
}