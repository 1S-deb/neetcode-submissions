class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        for( int i =0;i<nums.length;i++)
        {
            HashSet<Integer>set=new HashSet<>();
            for( int j =i+1;j<nums.length;j++)
            {
                int third= -(nums[i]+nums[j]);
                if( set.contains(third))
                {
                    List<Integer>temp=Arrays.asList(third, nums[i],nums[j]);
                    Collections.sort(temp);
                    if(!list.contains(temp))
                    {
                        list.add(temp);
                    }
                }
                set.add(nums[j]);
            }
        }
        return list;
    }
}
                