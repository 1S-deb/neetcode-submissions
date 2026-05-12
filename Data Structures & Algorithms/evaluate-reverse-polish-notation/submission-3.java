class Solution {
    public int evalRPN(String[] tokens) {
        int a=0;
        int b=0;
        Stack<Integer>stk=new Stack<>();
        for(String x:tokens)
        {
            if(x.equals("+"))
            {
                a=stk.pop();
                b=stk.pop();
                stk.push(b+a);
            }
            else if(x.equals("-"))
            {
                a=stk.pop();
                b=stk.pop();
                stk.push(b-a);
            }
            else if(x.equals("*"))
            {
                a=stk.pop();
                b=stk.pop();
                stk.push(b*a);
            }
            else if(x.equals("/"))
            {
                a=stk.pop();
                b=stk.pop();
                stk.push(b/a);
            }
            else
            {
                stk.push(Integer.parseInt(x));
            }
        }
        return stk.pop();
    }
}
