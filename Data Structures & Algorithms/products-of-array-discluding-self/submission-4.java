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
int res[]=new int[nums.length];
int cntzero=0;
int prod=1;
for( int x:nums)
{
    if(x==0 )
    {
        cntzero++;
    }
    else
    {
        prod*=x;
    }
}
for( int i =0;i<nums.length;i++)
{
        if( cntzero>1)
        {
            res[i]=0;
        }
        else if(cntzero==1)
        {
            if(nums[i]==0)
            {
                res[i]=prod;
            }
            else
            {
                res[i]=0;
            }
        }
        else
        {
            res[i]=prod/nums[i];
        }
    
}
return res;
    }
}