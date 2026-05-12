class Solution {
    public int evalRPN(String[] tokens) {
        int a=0, b=0;
        Stack<Integer>stk=new Stack<>();
        for( String s:tokens)
        {
            if(s.equals("+"))
            {
                a=stk.pop();
                b=stk.pop();
                stk.push(a+b);
            }
            else if(s.equals("-"))
            {
                a=stk.pop();
                b=stk.pop();
                stk.push(b-a);
            }
            else if(s.equals("/"))
            {
                a=stk.pop();
                b=stk.pop();
                stk.push(b/a);
            }
            else if(s.equals("*"))
            {
                a=stk.pop();
                b=stk.pop();
                stk.push(b*a);
                
            }
            else
            {
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.pop();
        
    }
}
