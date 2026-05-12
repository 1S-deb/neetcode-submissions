class Solution {
    public boolean isAnagram(String s, String t) {
       int freq1[]=new int[256];
       int  fre2[]=new int [256];
       for( int i =0;i<s.length();i++)
       {
          freq1[s.charAt(i)-'a']++;
       }
       for( int i=0;i<t.length();i++)
       {
        freq1[t.charAt(i)-'a']--;
       }
       for( int x:freq1)
       {
           if(x!=0)
           {
            return false;
           }
       }
       return true;
    }
}
       