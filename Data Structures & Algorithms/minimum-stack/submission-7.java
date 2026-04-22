class MinStack {
    Stack<Integer> s = new Stack<>();
    int min = Integer.MAX_VALUE;
    Stack<Integer> preMin = new Stack<>();
    public MinStack() {
        s = new Stack<>();
        preMin = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(preMin.size() != 0 && val <= preMin.peek()) preMin.push(val);
        if(preMin.size() == 0) preMin.push(val);
    }
    
    public void pop() {
        if(preMin.size() != 0 && s.peek().equals(preMin.peek())) preMin.pop();
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return preMin.peek();
    }
}
