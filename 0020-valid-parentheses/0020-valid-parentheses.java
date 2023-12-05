class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hashmap = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        hashmap.put('}','{');
        hashmap.put(')','(');
        hashmap.put(']','[');

        for(int i = 0; i < s.length(); i++) {
            if(hashmap.containsKey(s.charAt(i))) {
                if(stack.isEmpty() || !stack.pop().equals(hashmap.get(s.charAt(i)))) {
                    return false;
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        if(stack.isEmpty()) {
            return true;
        }
        return false;

    }
}