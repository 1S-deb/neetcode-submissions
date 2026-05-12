class Solution {
    public static void fun( int nums[] , int ind, HashSet<List<Integer>>set,List<Integer>res )
    {
        if(ind==nums.length)
        {
            set.add(new ArrayList<>(res));
            return;
        }
        
        
        res.add(nums[ind]);
        fun(nums, ind+1,set,res);
        res.remove(res.size()-1);
        fun(nums,ind+1,set,res);
        }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       HashSet<List<Integer>>set=new HashSet<>() ;
       List<Integer>res=new ArrayList<>();
       Arrays.sort(nums);
       fun( nums, 0 , set, res);
       return new ArrayList<>(set);
    }
}

