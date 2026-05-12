class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        int maxlen=0;
        for(int x:set)
        {
            if(!set.contains(x-1))
            {
                int currsum=x;
                int cnt=1;
                while(set.contains(currsum+1))
                {
                    currsum++;
                    cnt++;
                }
                maxlen= Math.max(maxlen,cnt);

            }
        }
            return maxlen;
        }
    
}

