class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int cntZero=0;
        int prod=1;
        for( int i =0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                cntZero++;
            }
            else
            {
                prod*=nums[i];
            }
        }
        for(int i =0;i<nums.length;i++)
        {
            if(cntZero>1)
            {
                res[i]=0;
            }
            else if(cntZero==1)
            {
                res[i]=(nums[i]==0)?prod:0;
            }
            else 
            {
                res[i]=prod/nums[i];
            }
        }
        return res;
        
    }
}  
