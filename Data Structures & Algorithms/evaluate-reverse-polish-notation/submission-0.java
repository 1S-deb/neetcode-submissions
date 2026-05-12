class Solution {
    public int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer>stk =new Stack<>();
        for(String s:tokens)
        {
            if(s.equals("+")){
            a=stk.pop();
            b=stk.pop();
            stk.push(b+a);
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