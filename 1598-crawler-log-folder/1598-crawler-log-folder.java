class Solution {
    public int minOperations(String[] logs) {
        Stack<Integer> stack = new Stack<>();

        for(String s : logs) {
            if(s.equals("../")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else if(s.equals("./")) {
                continue;
            }
            else {
                stack.push(1);
            }
        }

        System.out.println(stack.size());

        return stack.size();
    }
}