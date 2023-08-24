class MinStack {
     Stack<Integer> stack;
     Stack<Integer> m_stack;
    public MinStack() {
        stack=new Stack<>();
        m_stack=new Stack<>();
    }
    
    public void push(int val) {
        if(m_stack.isEmpty() || m_stack.peek()>=val){
            m_stack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if( m_stack.peek().equals(stack.peek())){
            m_stack.pop();
        }
        stack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return m_stack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */