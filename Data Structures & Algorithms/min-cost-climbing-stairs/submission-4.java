class Solution {
    public int fun( int ind, int cost[])
    {
        if( ind>=cost.length)
        {
            return 0;
        }
        int step1= cost[ind]+fun( ind+1,cost);
        int step2=cost[ind]+fun(ind+2,cost);
        return Math.min(step1,step2);
    }
    public int minCostClimbingStairs(int[] cost) {
        return (Math.min(fun(0, cost),fun(1,cost)));
    }
}
