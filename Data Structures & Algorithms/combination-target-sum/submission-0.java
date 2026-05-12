class Solution {
    public static void fun( int nums[], int ind, int target, List<List<Integer>> res,List<Integer>ans )
    {
        if(target==0)
        {
            res.add( new ArrayList<>(ans));
            return ;
        }
        if( target<0 ||ind>=nums.length)
        {
           return;
        }
         ans.add( nums[ind]);
         fun( nums, ind,target-nums[ind],res,ans);
         ans.remove(ans.size()-1);
         fun( nums, ind+1, target, res,ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer>ans= new ArrayList<>();
        fun( nums, 0, target,res, ans);
        return res;
    }
}
