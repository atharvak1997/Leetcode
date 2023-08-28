class MyStack {
    ArrayList<Integer> array = new ArrayList<>();
    int top;
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        array.add(x);
        top = x;
    }
    
    public int pop() {
        return array.remove(array.size() - 1);
        
    }
    
    public int top() {
        return array.get(array.size() - 1);
    }
    
    public boolean empty() {
        return array.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */