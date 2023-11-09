class Solution {
    public int countCollisions(String directions) {
        Stack<Character> stack = new Stack<>();
        int collisions = 0;
        stack.push(directions.charAt(0));

        for(int i = 1; i < directions.length(); i++) {
            char curr = directions.charAt(i);

            if(!stack.isEmpty() && stack.peek() == 'R' && curr == 'L') {
                stack.pop();
                curr = 'S';
                collisions += 2;
            }
            else if (!stack.isEmpty() && stack.peek() == 'S' && curr == 'L') {
                curr = 'S';
                collisions += 1;
            }
            while(!stack.isEmpty() && stack.peek() == 'R' && curr == 'S') {
                curr = 'S';
                stack.pop();
                collisions += 1;
            }

            stack.push(curr);
        }

        return collisions;
    }
}