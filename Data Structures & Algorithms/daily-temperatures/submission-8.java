class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
//         int result[]=new int[temperatures.length];
//        for( int i =0;i<temperatures.length;i++) 
//        {
//         for( int j =i+1;j<temperatures.length;j++)
//         {
//             if(temperatures[i]<temperatures[j])
//             {
//                 result[i]=j-i;
//                 break;
//             }
//         }
//        }
//        return result;
//     }
// }
Stack<Integer>stk=new Stack<>();
int res[]=new int[temperatures.length];
for( int i =temperatures.length-1;i>=0;i--)
{
    while(!stk.isEmpty() && temperatures[stk.peek()]<=temperatures[i])
    {
        stk.pop();
    }
    if(!stk.isEmpty())
    {
        res[i]=stk.peek()-i;
    }
    stk.push(i);
}
return res;
    }
}