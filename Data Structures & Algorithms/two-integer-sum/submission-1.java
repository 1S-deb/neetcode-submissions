// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int arr[]=new int[2];
//         for( int i =0;i<nums.length;i++)
//         {
//             for( int j =i+1;j<nums.length;j++)
//             {
//                 if(i!=j && nums[i]+nums[j]==target)
//                 {
//                     arr[0]=i;
//                     arr[1]=j;
//                 }
//             }
//         }
//         return arr;
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>mp=new HashMap<>();
       int arr[]=new int[2];
       for( int i =0;i<nums.length;i++)
       {
         int comp= target-nums[i];
         if(mp.containsKey(comp))
         {
            arr[0]=mp.get(comp);
             arr[1]=i;
         }
         mp.put(nums[i],i);
       }
       return arr;
    }
}