class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i =0;i<s.length();i++)
        {
            char c=s.charAt(i);
            mp.put(c, mp.getOrDefault(c,0)+1);


        }
        int eve=Integer.MAX_VALUE;
        int odd=Integer.MIN_VALUE;
        for( int i =0;i<s.length();i++)
        {
            char c=s.charAt(i);
           int f=mp.get(c);
           if(f%2==0) 
           {
            eve= Math.min(eve,f);
           }
           else
           {
            odd=Math.max(odd,f);
           }
        }
        return odd-eve;
    }
}