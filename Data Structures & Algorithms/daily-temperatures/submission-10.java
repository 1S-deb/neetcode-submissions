class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
//         int res[]=new int[temperatures.length];
//         Stack<Integer>stk=new Stack<>();
//         for( int i =0;i<temperatures.length;i++)
//         {
//             while(!stk.isEmpty()&& temperatures[stk.peek()]<temperatures[i])
//             {
//              int x= stk.pop();
//              res[x]=i-x;
//             }
        
//         stk.push(i);
//         }
//         return res;
//     }
// }
int res[]=new int[temperatures.length];

  for( int i =0;i<temperatures.length;i++)
  {
    for( int j =i+1;j<temperatures.length;j++)
    {
        if(temperatures[j]>temperatures[i])
        {
            res[i]=j-i;
            break;
        }
    }
  }
    return res;
  }
}
