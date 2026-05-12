class Solution {
   
    public int rob(int[] nums) {
        
        
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        

        for( int i=1;i<nums.length;i++)
        {
            int incl=nums[i];
            if(i>1)
            {
                incl+=dp[i-2];
            }
            int excl=dp[i-1];
            dp[i]=Math.max(incl,excl);
        }
        return dp[nums.length-1];
    }
}
