class Solution {
    public int findLucky(int[] arr) {
    HashMap<Integer,Integer>mp=new HashMap<>();
     for( int x:arr)
     {
        mp.put(x,mp.getOrDefault(x,0)+1);
     }
     int ans=-1;
     for( int x:arr)
     {
        int f= mp.get(x);
        if(f==x)
        {
            ans= Math.max(ans,f);
        }
     }
     return ans;
    }
}