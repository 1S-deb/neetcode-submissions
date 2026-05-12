class Solution {
    public int fun( int ind, int nums[],int dp[])
    {
        if( ind>=nums.length)
        {
            return 0;
        }
        if(dp[ind]!=Integer.MIN_VALUE)
        {
            return dp[ind];
        }
        int incl= nums[ind]+fun(ind+2,nums,dp);
        int excl=fun(ind+1,nums,dp);
        dp[ind]=Math.max(incl,excl);
        return dp[ind];
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        for( int i=0;i<dp.length;i++)
        {
            dp[i]=Integer.MIN_VALUE;
        }
        return fun(0,nums,dp);
    }
}
