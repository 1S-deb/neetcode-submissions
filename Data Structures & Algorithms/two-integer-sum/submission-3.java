class Solution {
    public int[] twoSum(int[] nums, int target) {
//         Arrays.sort(nums);
//         int l =0;
//         int r=nums.length-1;
//         while(l<=r)
//         {
//             int ans= nums[l]+nums[r];
//             if(ans<target)
//             {
//                 l++;
//             }
//             else if(ans>target)
//             {
//                 r--;
//             }
//             else
//             {
//                 return new int[]{l,r};
//             }
//         }
//         return new int[0];


//     }
// }
HashMap<Integer,Integer>mp=new HashMap<>();
for( int i =0;i<nums.length;i++)
{
    int comp=target-nums[i];
    if( mp.containsKey(comp))
    {
        return new int[]{mp.get(comp),i};
    }
    mp.put(nums[i],i);
}
return new int[0];
    }
}