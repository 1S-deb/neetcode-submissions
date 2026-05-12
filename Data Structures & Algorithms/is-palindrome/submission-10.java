class Solution {
    public boolean isPalindrome(String s) {
//        StringBuilder str=new StringBuilder();
//         for(int i =0;i<s.length();i++)
//         {
//             if(Character.isLetterOrDigit(s.charAt(i)))
//             {
//                 str.append(Character.toLowerCase(s.charAt(i)));
//             }
//         }
//         if(str.toString().equals(str.reverse().toString()))
//         {
//             return true;
//         }
//         return false;
//     }
// }
// int l =0;
// int r=s.length()-1;
// while(l<=r)
// {
//     while(l<r && !Character.isLetterOrDigit(s.charAt(l)))
//     {
//         l++;
//     }
//     while(l<r && !Character.isLetterOrDigit(s.charAt(r)))
//     {
//         r--;
//     }
//     if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
//     {
//         return false;
//     }
//     l++;
//     r--;
// }
// return true;
//     }
// }
StringBuilder str=new StringBuilder();
        for(int i =0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
          String ans= str.toString();
          for( int i =0;i<ans.length()/2;i++)
          {
             if( ans.charAt(i)!=ans.charAt(ans.length()-i-1))
             {
                  return false;
             }
          }
          return true;
    }
}