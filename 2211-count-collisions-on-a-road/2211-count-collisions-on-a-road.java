class Solution {
    public int countCollisions(String directions) {
        Stack<Character> stack = new Stack<>();
        int coll = 0;
        stack.push(directions.charAt(0));

        for(int i = 1; i < directions.length(); i++) {
            char curr = directions.charAt(i);

            if(!stack.isEmpty() && stack.peek() == 'R' && curr == 'L') {
                stack.pop();
                curr = 'S';
                coll += 2;
            }
            else if(!stack.isEmpty() && stack.peek() == 'S' && curr == 'L') {
                curr = 'S';
                coll += 1;
            }
            while(!stack.isEmpty() && ((stack.peek() == 'R' && curr == 'S') )){
                coll += 1;
                stack.pop();
            }

            stack.push(curr);
        }

        return coll;
    }
}