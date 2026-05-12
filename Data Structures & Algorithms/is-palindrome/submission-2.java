// class Solution {
//     public boolean isPalindrome(String s) {
//         //ArrayList<Character>list=new ArrayList<>()
//        StringBuilder ans=new StringBuilder();
//         for(int i =0;i<s.length();i++)
//         {
//             if(Character.isLetterOrDigit(s.charAt(i)))
//             {
//                 ans.append(Character.toLowerCase(s.charAt(i)));
//             }
//         }
//         StringBuilder ans2=new StringBuilder();
//         for( int i =ans.length()-1;i>=0;i--)
//         {
//             ans2.append(ans.charAt(i));
//         }
//         if(ans.toString().equals(ans2.toString()))
//         {
//             return true;
//         }
//         return false;
//     }
// }
// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder ans=new StringBuilder();
//         for( char ch:s.toCharArray())
//         {
//             if(Character.isLetterOrDigit(ch))
//             {
//                 ans.append(Character.toLowerCase(ch));
//             }
//         }
//         return ans.toString().equals(ans.reverse().toString());
//     }
// }
class Solution {
    public boolean alphaNum(char c)
    {
        return (c>='A' && c<='Z'||c>='a'&& c<='z'||c>='0'&& c<='9');
    }
 public boolean isPalindrome(String s) {
    int l=0;
    int r = s.length()-1;
    while(l<r)
    {
        while( l<r && !alphaNum(s.charAt(l)))
        {
            l++;
        }
        while(r>l && !alphaNum(s.charAt(r)))
        {
            r--;
        }
        if( Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
        {
            return false;
        }
        l++;
        r--;
    }
    return true;
 }
}
