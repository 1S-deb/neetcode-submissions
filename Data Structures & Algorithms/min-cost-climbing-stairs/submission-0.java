class Solution {
    public int fun( int i, int cost[])
    {
        if(i>=cost.length)
        {
            return 0;
        }
        int step1= fun(i+1,cost);
        int step2=fun(i+2,cost);
        return cost[i]+Math.min(step1,step2);
    }
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(fun(0,cost),fun(1,cost));
    }
}
