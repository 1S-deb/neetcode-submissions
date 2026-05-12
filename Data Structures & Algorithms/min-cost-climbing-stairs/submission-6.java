class Solution {
    // public int fun( int ind, int cost[],int dp[])
    // {
    //     if( ind>=cost.length)
    //     {
    //         return 0;
    //     }
    //     if(dp[ind]!=Integer.MAX_VALUE)
    //     {
    //         return dp[ind];
    //     }
    //     int step1= cost[ind]+fun( ind+1,cost,dp);
    //     int step2=cost[ind]+fun(ind+2,cost,dp);
    //     dp[ind] =Math.min(step1,step2);
    //     return dp[ind];
    // }
    public int minCostClimbingStairs(int[] cost) {
         int dp[]=new int [cost.length+1];
        //  for( int i =0;i<dp.length;i++)
        //  {
        //     dp[i]=Integer.MAX_VALUE;
        //  }
        for( int i =0;i<=cost.length;i++)
        {
            int step1= 0;
            int step2=0;
            if(i>=1)
            {
                step1=cost[i-1]+dp[i-1];
            }
            if(i>=2)
            {
                step2=cost[i-2]+dp[i-2];
            }
            dp[i]=Math.min(step1,step2);
        }
        return dp[cost.length];
    }
}
