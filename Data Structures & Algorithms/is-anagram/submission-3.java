// class Solution {
//     public boolean isAnagram(String s, String t) {
//        int freq1[]=new int[256];
//        //int  fre2[]=new int [256];
//        for( int i =0;i<s.length();i++)
//        {
//           freq1[s.charAt(i)-'a']++;
//        }
//        for( int i=0;i<t.length();i++)
//        {
//         freq1[t. charAt(i)-'a']--;
//        }
//        for( int x:freq1)
//        {
//            if(x!=0)
//            {
//             return false;
//            }
//        }
//        return true;
//     }
// }
class Solution {
     public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer>mp=new HashMap<>();
        for( int i =0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
             mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)-1);
        }
        for(Map.Entry<Character,Integer>e:mp.entrySet())
        {
            char ch=e.getKey();
            int freq=e.getValue();
            if(freq!=0)
            {
                return false;
            }
        }
        return true;
     }
}
       