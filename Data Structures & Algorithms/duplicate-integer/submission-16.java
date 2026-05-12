// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         // array cannot handle negative indexing
//         Arrays.sort(nums);
//         int maxi= nums[nums.length-1];
//        int freq[]=new int[maxi+1];
//        for( int i =0;i<nums.length;i++)
//        {
//          freq[nums[i]]++;
//        }
//        for( int f:freq)
//        {
//         if(f>1)
//         {
//             return true;
//         }
//        }
//        return false;
//     }
// }
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         HashMap<Integer,Integer>mp=new HashMap<>();
//         for( int i =0;i<nums.length;i++)
//         {
//             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
//         }
//         for( int f:mp.values())
//         {
//             if( f>1)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         for(int i =0;i<nums.length;i++)
//         {
//             for( int j =i+1;j<nums.length;j++)
//             {
//                 if(nums[i]==nums[j])
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i =0;i<nums.length;i++)
//         {
//             if(i>0 && nums[i]==nums[i-1])
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i =0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}