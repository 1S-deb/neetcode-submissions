// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int res[]=new int[nums.length];
//         int left[]=new int[nums.length];
//         left[0]=1;
//         for(int i =1;i<nums.length;i++)
//         {
//           left[i]=left[i-1]*nums[i-1];
//         }
//         int right[]=new int[nums.length];
//         right[nums.length-1]=1;
//         for(int i =nums.length-2;i>=0;i--)
//         {
//           right[i]=right[i+1]*nums[i+1];
//         }
//         for(int i =0;i<nums.length;i++)
//         {
//           res[i]=left[i]*right[i];
//         }
//         return res;
//     }
// }  

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int res[]=new int[nums.length];
//         res[0]=1;
//         for(int i =1;i<nums.length;i++)
//         {
//           res[i]=res[i-1]*nums[i-1];
//         }

//          int right=1;
//         for(int i =nums.length-1;i>=0;i--)
//         {
//            res[i]*=right;
//            right*=nums[i];
//         }
        
//         return res;
//     }
// }  

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int res[]=new int[n];
        int zerocnt=0;
        long prod=1;
        for(int x:nums)
        {
          if(x==0)
          {
            zerocnt++;
          }
          else{
          prod*=x;
          }
        }
        for(int i =0;i<n;i++)
        {
          if(zerocnt>1)
          {
            res[i]=0;
          }
          else if(zerocnt==1)
          {
             res[i]=(nums[i]==0)? (int)prod:0;                                                                                                                                     
          }
          else 
          {
            res[i]=(int)(prod/nums[i]);
          }
        }
        return res;


    }
}