class MinStack {
    public Stack<Integer>stk;
    public Stack<Integer>minstk;
    public MinStack() {
        stk=new Stack<>();
        minstk=new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(minstk.isEmpty()||minstk.peek()>=val)
        {
            minstk.push(val);
        }
    }
    
    public void pop() {
        int x=stk.pop();
        if(x==minstk.peek())
        {
            minstk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}
