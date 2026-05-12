//T.C->O(N*N)
//  class Solution {
//      public boolean hasDuplicate(int[] nums) {
//        Arrays.sort(nums);
//      for( int i =0;i<nums.length;i++)
//       {
//         for( int j =i+1;j<nums.length;j++)
//        if(nums[i]==nums[j])
//          {
//             return true;
//          }
//        }
//         return false;
//      }
//  }

// //T.C->O(N)
// // class Solution {
// //     public boolean hasDuplicate(int[] nums) {
// //         Arrays.sort(nums);
// //        for( int i =0;i<nums.length-1;i++)
// //        {
// //         if(nums[i]==nums[i+1])
// //         {
// //             return true;
// //         }
// //        }
// //        return false;
// //     }
// // }
// //T.C->O(N^2)
// // class Solution {
// //     public boolean hasDuplicate(int[] nums) {
// //        for( int i =0;i<nums.length;i++)
// //        {
// //         for(int j =i+1;j<nums.length;j++)
// //         {
// //             if(nums[i]==nums[j])
// //             {
// //                 return true;
// //             }
// //         }
// //        }
// //        return false;
// //     }
// //}
// // class Solution {
// //     public boolean hasDuplicate(int[] nums) {
// //         Arrays.sort(nums);
// //        for( int i =0;i<nums.length-1;i++)
// //        {
// //         if(nums[i]==nums[i+1])
// //         {
// //             return true;
// //         }
// //        }
// //        return false;
// //     }
// // }
// // class Solution {
// //     public boolean hasDuplicate(int[] nums) {
// //         HashSet<Integer>set= new HashSet<>();
// //         for(int x:nums)
// //         {
// //             if(set.contains(x))
// //             {
// //                return true;
// //             }
// //             set.add(x);
// //         }
// //         return false;
// //     }
// // }
// // class Solution {
// //     public boolean hasDuplicate(int[] nums) {
// //         Arrays.sort(nums);
// //        for( int i =0;i<nums.length-1;i++)
// //        {
// //         if(nums[i]==nums[i+1])
// //         {
// //             return true;
// //         }
// //        }  // this will handle index out of exception 
                // because array cannot handle negative index
// //        return false;
// //     }
// // }
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
        
//          ArrayList<Integer>lis=new ArrayList<>();
//          for( int x:nums)
//          {
//             if(lis.contains(x))
//             {
//                 return true;
//             }
//             lis.add(x);
//          }
//          return false;
//     }
// }
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
//T.C->O(N)
class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int x:nums)
       {
        mp.put(x,mp.getOrDefault(x,0)+1);
       }
       //set of all key-value pairs int the map
    //    for(Map.Entry<Integer,Integer>e: mp.entrySet() )
    //    {
    //       int key=e.getKey();
    //       int freq= e.getValue();
    for( int freq:mp.values())
          if(freq>1)
          {
            return true;
          }
       
       return false;
    }
}