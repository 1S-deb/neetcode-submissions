class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        for( int i =0;i<nums.length;i++)
        {
            HashSet<Integer>set=new HashSet<>();
            for(int j =i+1;j<nums.length;j++)
            {
                int target= -(nums[i]+nums[j]);
                if(set.contains(target))

                {
                    List<Integer>temp=Arrays.asList(nums[i],nums[j],target);
                    {
                        Collections.sort(temp);
                        if(!list.contains(temp))
                        {
                            list.add(temp);
                        }
                    }

                }
                set.add(nums[j]);
            }
        }
        return list;
    }
}
