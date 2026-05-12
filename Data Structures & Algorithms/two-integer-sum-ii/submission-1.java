// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int arr[]=new int[2];
//         for( int i =0;i<numbers.length;i++)
//         {
//             for( int j =i+1;j<numbers.length;j++)
//             {
//                 if(numbers[i]+numbers[j]==target)
//                 {
//                     arr[0]=i+1;
//                     arr[1]=j+1;
//                 }
//             }
//         }
//         return arr;
//     }
// }
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l =0;
        int r=numbers.length-1;
        while(l<r)
        {
            int curr= numbers[l]+numbers[r];
            if(curr>target)
            {
                r--;
            }
            else if( curr<target)
            {
                l++;
            }
            else
            {
                return new int[]{l+1,r+1};
            }
        }
        return new int[0];
    }

}