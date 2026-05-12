// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int n =temperatures.length;
//         int arr[]=new int[n];
//         Stack<Integer>stk=new Stack<>();
//         for(int i=n-1;i>=0;i--)
//         {
//             while(!stk.isEmpty()&& temperatures[stk.peek()]<=temperatures[i])
//             {
//                 stk.pop();
//             }
//             if(!stk.isEmpty())
//             {
//                 arr[i]=stk.peek()-i;
//             }
//             stk.push(i);
//         }
//         return arr;
//     }
// }
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n =temperatures.length;
        int res[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(temperatures[i]<temperatures[j])
                {
                    res[i]=j-i;
                    break;
                }
            }
        }
        return res;
    }
}