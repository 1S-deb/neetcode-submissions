class Solution {
    public static void fun(int ind,int nums[],int target, List<List<Integer>>list,List<Integer>arr)
    {
        if(target==0)
        {
            list.add(new ArrayList<>(arr));
            return ;
        }
        if(target<0 ||ind>=nums.length)
        {
            return ;
        }
        //pick
        arr.add(nums[ind]);
        fun(ind,nums,target-nums[ind],list,arr);
        //backtrack
        arr.remove(arr.size()-1);
        //non pick
        fun(ind+1,nums,target,list,arr);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        fun(0,nums,target,list,arr);
        return list;
    }
}
