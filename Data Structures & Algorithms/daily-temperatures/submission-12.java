class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[]=new int [temperatures.length];
        Stack<Integer>stk=new Stack<>();
        for( int i =0;i<temperatures.length;i++)
        {
            while(!stk.isEmpty() && temperatures[stk.peek()]<temperatures[i] )
            {
                int j = stk.pop();
                res[j]=i-j;
            }
            stk.push(i);
        }
        return res;
    }
}