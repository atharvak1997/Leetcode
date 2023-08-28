class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hashmap = new HashMap<>();
        hashmap.put('}','{');
        hashmap.put(']','[');
        hashmap.put(')','(');
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hashmap.containsKey(ch)) {
                if(stack.isEmpty() || hashmap.get(ch) != stack.pop()) {
                    return false;
                }
            }
            else {
                stack.add(ch);
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}

