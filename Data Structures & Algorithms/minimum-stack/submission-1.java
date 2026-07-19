class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.isEmpty() || val <= minSt.peek()){
            minSt.push(val);
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            int val = st.pop();
            if(minSt.peek() == val) minSt.pop();
        }
    }
    
    public int top() {
        return st.isEmpty() ? -1 : st.peek();
    }
    
    public int getMin() {
        return minSt.isEmpty() ? -1 : minSt.peek();
    }
}
