class MinStack {
 private Stack<Integer>stk;
    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int val) {
        
        stk.push(val);
       
    }
    
    public void pop() {
         stk.pop();
        
    }
    
    public int top() {
        int top =stk.peek();
        return top;
    }
    
    public int getMin() {
        Stack<Integer>temp =new Stack<>();
        int mini=stk.peek();
        while(!stk.isEmpty())
        {
            mini = Math.min(mini,stk.peek());
        
        temp.push(stk.pop());
       }
    while(!temp.isEmpty())
    {
        stk.push(temp.pop());

    }
    return mini;
}
}
