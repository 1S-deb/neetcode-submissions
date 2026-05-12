class Solution {
    public int[] getConcatenation(int[] nums) {
        int ind=0;
        int arr[]=new int[2*nums.length];
        for(int i =0;i<nums.length;i++)
        {
            arr[ind++]=nums[i];
        }
        while(ind<arr.length)
        {
            for(int i =0;i<nums.length;i++)
            {
                arr[ind++]=nums[i];
            }
        }
        return arr;
    }
}