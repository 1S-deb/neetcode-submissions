class Solution {
    public int fun( int ind ,int dp[])
    {
        if(ind==0 ||ind==1)
        {
            return 1;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int step1= fun(ind-1,dp);
        int step2=fun(ind-2,dp);
        dp[ind]=step1+step2;
        return dp[ind];
        
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        for(int i =0;i<n+1;i++)
        {
            dp[i]=-1;
        }
        return fun(n,dp);
    }
}
