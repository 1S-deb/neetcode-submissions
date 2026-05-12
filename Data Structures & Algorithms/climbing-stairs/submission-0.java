class Solution {
    public int fun( int ind)
    {
        if(ind==0 ||ind==1)
        {
            return 1;
        }
        int step1= fun(ind-1);
        int step2=fun(ind-2);
        return step1+step2;
        
    }
    public int climbStairs(int n) {
        return fun(n);
    }
}
