class Solution {
    public int fun( int i, int cost[],int dp[])
    {
        if(i>=cost.length)
        {
            return 0;
        }
        if(dp[i]!=Integer.MAX_VALUE)
        {
            return dp[i];
        }
        int step1= fun(i+1,cost,dp);
        int step2=fun(i+2,cost,dp);
        dp[i]= cost[i]+Math.min(step1,step2);
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        for( int i =0;i<dp.length;i++)
        {
            dp[i]=Integer.MAX_VALUE;
        }
        return Math.min(fun(0,cost,dp),fun(1,cost,dp));
    }
}
