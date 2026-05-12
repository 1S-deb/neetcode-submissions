class Solution {
    public static void fun(int ind, int nums[],HashSet<List<Integer>>set, List<Integer>list)
    {
        if(ind>=nums.length)
        {
            set.add(new ArrayList<>(list));
            return;
        }
         //pick
         list.add(nums[ind]);
         fun(ind+1,nums,set,list);
         //backtrack
         list.remove(list.size()-1);
         //non pick
         fun(ind+1,nums,set,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        fun(0,nums,set,list);
        return new ArrayList<>(set);
    }
}
