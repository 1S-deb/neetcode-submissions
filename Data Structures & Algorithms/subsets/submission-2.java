class Solution {
    public static void fun(int ind, int nums[],List<List<Integer>>list, List<Integer>arr)
    {
        if(ind>=nums.length)
        {
            list.add(new ArrayList<>(arr));
            return ;
        }
        //pick
        arr.add(nums[ind]);
        fun(ind+1,nums,list,arr);
        //backtrack
        arr.remove(arr.size()-1);
        //non pick
        fun(ind+1,nums,list,arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        fun(0,nums,list,arr);
        return list;
    }
}
