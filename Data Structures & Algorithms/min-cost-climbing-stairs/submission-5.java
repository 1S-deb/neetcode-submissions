class Solution {
    public int fun( int ind, int cost[],int dp[])
    {
        if( ind>=cost.length)
        {
            return 0;
        }
        if(dp[ind]!=Integer.MAX_VALUE)
        {
            return dp[ind];
        }
        int step1= cost[ind]+fun( ind+1,cost,dp);
        int step2=cost[ind]+fun(ind+2,cost,dp);
        dp[ind] =Math.min(step1,step2);
        return dp[ind];
    }
    public int minCostClimbingStairs(int[] cost) {
         int dp[]=new int [cost.length+1];
         for( int i =0;i<dp.length;i++)
         {
            dp[i]=Integer.MAX_VALUE;
         }
        return (Math.min(fun(0, cost,dp),fun(1,cost,dp)));
    }
}
