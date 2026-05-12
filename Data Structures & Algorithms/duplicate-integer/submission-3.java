//T.C->O(N)
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Arrays.sort(nums);
//        for( int i =0;i<nums.length-1;i++)
//        {
//         if(nums[i]==nums[i+1])
//         {
//             return true;
//         }
//        }
//        return false;
//     }
// }
//T.C->O(N^2)
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//        for( int i =0;i<nums.length;i++)
//        {
//         for(int j =i+1;j<nums.length;j++)
//         {
//             if(nums[i]==nums[j])
//             {
//                 return true;
//             }
//         }
//        }
//        return false;
//     }
//}
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Arrays.sort(nums);
//        for( int i =0;i<nums.length-1;i++)
//        {
//         if(nums[i]==nums[i+1])
//         {
//             return true;
//         }
//        }
//        return false;
//     }
// }
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>set= new HashSet<>();
        for(int x:nums)
        {
            if(set.contains(x))
            {
               return true;
            }
            set.add(x);
        }
        return false;
    }
}