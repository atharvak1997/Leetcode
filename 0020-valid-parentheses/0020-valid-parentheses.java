class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hashmap = new HashMap<>(){{
            put('}', '{');
            put(')', '(');
            put(']', '[');
        }};
        Stack<Character> stack = new Stack<>();
        
        
        for(int chara = 0; chara < s.length(); chara++) {
            char c = s.charAt(chara);
            if(hashmap.containsKey(c)) {
                if(stack.isEmpty() || stack.pop() != hashmap.get(c)) {
                    return false;
                    }
                } 
            else {
                stack.push(c);
            }
            
            }
        
        if(stack.isEmpty()){
            return true;
        }
        return false;
        
    }
}