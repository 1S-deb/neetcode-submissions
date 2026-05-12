class Solution {
    public static void fun( int nums[],boolean[]used, List<List<Integer>>res,List<Integer>ds)
    {
        if(ds.size()==nums.length)
        {
            res.add(new ArrayList<>(ds));
            return ;
        }
        for( int i =0;i<nums.length;i++)
        {
            if( used[i])
            {
                continue;
            }
            used[i]=true;
            ds.add(nums[i]);
            fun(nums,used,res,ds);
            ds.remove(ds.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res= new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean[]used=new boolean[nums.length];
        fun(nums,used,res,ds);
        return res;
    }
        
}
