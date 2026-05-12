class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for( int i =0;i<=nums.length;i++)
        {
            sum+=i;
        }
        int sum2=0;
        for( int num:nums)
        {
            sum2+=num;
        }
        return Math.abs(sum-sum2);
    }
}