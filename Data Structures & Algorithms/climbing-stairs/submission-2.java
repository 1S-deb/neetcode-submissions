class Solution {
    // public int fun( int ind ,int dp[])
    // {
    //     if(ind==0 ||ind==1)
    //     {
    //         return 1;
    //     }
    //     if(dp[ind]!=-1)
    //     {
    //         return dp[ind];
    //     }
    //     int step1= fun(ind-1,dp);
    //     int step2=fun(ind-2,dp);
    //     dp[ind]=step1+step2;
    //     return dp[ind];
        
    // }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for( int i =2;i<=n;i++)
        {
            int step1=dp[i-1];
            int step2=dp[i-2];
            dp[i]=step1+step2;
        }
        return dp[n];
    }
}
