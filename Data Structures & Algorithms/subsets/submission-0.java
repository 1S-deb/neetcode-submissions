class Solution {
    public void fun(int ind, int nums[], List<Integer>list, List<List<Integer>>res)
    {
        if(ind>=nums.length)
        {
            res.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[ind]);
        fun(ind+1,nums,list,res);
        list.remove(list.size()-1);
        fun(ind+1,nums,list,res);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        fun(0,nums,list,res);
        return res;
    }
}
