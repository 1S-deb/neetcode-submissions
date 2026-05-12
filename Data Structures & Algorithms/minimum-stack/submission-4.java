class MinStack {
 private Stack<Integer>stk;
    public MinStack() {
        stk=new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
    }
    
    public void pop() {
        
        stk.pop();
    }
    
    public int top() {
        int top=stk.peek();
        return top;
    }
    
    public int getMin() {
        Stack<Integer>temp=new Stack<>();
        int min= stk.peek();
        while(!stk.isEmpty())
        {
            min= Math.min(min,stk.peek());
            temp.push(stk.pop());
        }
        while(!temp.isEmpty())
        {
            stk.push(temp.pop());
        }
        return min;
    }
}
