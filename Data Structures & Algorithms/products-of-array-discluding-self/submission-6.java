class Solution {
    public int[] productExceptSelf(int[] nums) {
//         int res[]=new int[nums.length];
//         for( int i =0;i<nums.length;i++)
//         {   int prod=1;
//             for( int j =0;j<nums.length;j++)
//             {
//                 if(i!=j)
//                 {
//                     prod=prod*nums[j];
//                 }
//             }
//             res[i]=prod;
//         }
//         return res;
//     }
// }
// int res[]=new int[nums.length];
// int cntzero=0;
// int prod=1;
// for( int x:nums)
// {
//     if(x==0 )
//     {
//         cntzero++;
//     }
//     else
//     {
//         prod*=x;
//     }
// }
// for( int i =0;i<nums.length;i++)
// {
//         if( cntzero>1)
//         {
//             res[i]=0;
//         }
//         else if(cntzero==1)
//         {
//             if(nums[i]==0)
//             {
//                 res[i]=prod;
//             }
//             else
//             {
//                 res[i]=0;
//             }
//         }
//         else
//         {
//             res[i]=prod/nums[i];
//         }
    
// }
// return res;
//     }
// }
// int res[]=new int[nums.length];
// int n=nums.length;
// int left[]=new int[n];
// int right[]=new int[n];
// left[0]=1;
// right[n-1]=1;
// for( int i =1;i<n;i++)
// {
//     left[i]= left[i-1]*nums[i-1];
// }
// for( int i =n-2;i>=0;i--)
// {
//     right[i]= right[i+1]*nums[i+1];
// }
// for( int i =0;i<n;i++)
// {
//     res[i]=left[i]*right[i];
// }
// return res;
//     }
// }
int res[]=new int[nums.length];
res[0]=1;
for( int i =1;i<nums.length;i++)
{
    res[i]=res[i-1]*nums[i-1];
}
int right_prod=1;
for( int i =nums.length-1;i>=0;i--)
{
    res[i]= res[i]*right_prod;
    right_prod*=nums[i];
}
return res;
    }
}