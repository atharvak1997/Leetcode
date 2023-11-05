class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i : asteroids) {
            while(!stack.isEmpty() && i < 0 && stack.peek() > 0) {
                int diff = stack.peek() + i;

                if(diff < 0) {
                    stack.pop();
                }
                else if(diff > 0) {
                    i = 0;
                }
                else {
                    i = 0;
                    stack.pop();
                }
            }
            if(i != 0) {
                stack.add(i);
            }
        }

        ArrayList<Integer> arrList = new ArrayList<>();

        while(!stack.isEmpty()) {
            arrList.add(stack.pop());
        }

        Collections.reverse(arrList);
        int m = 0;
        int[] answer = new int[arrList.size()];
        for(int j : arrList) {
            answer[m] = j;
            m++;
        }

        return answer;
    }
}