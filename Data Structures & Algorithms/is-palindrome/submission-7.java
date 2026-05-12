class Solution {
 public boolean isAlphanum(char c)
 {
    if((c>='A' && c<='Z')||(c>='a'&& c<='z')||(c>='0'&& c<='9'))
    {
        return true;
    }
    return false;
 }
    public boolean isPalindrome(String s) {
    //     StringBuilder str =new StringBuilder();
    //     for( int i =0;i<s.length();i++)
    //     {
    //         if(Character.isLetterOrDigit(s.charAt(i)))
    //         {
    //             str.append(Character.toLowerCase(s.charAt(i)));
    //         }
    //     }
    //         if( str.toString().equals(str.reverse().toString()))
    //         {
    //             return true;
    //         }
    //         return false;
    //     }
    // }
 int l=0;
 int r=s.length()-1;
 while(l<r)
 {
    while(l<r && !isAlphanum(s.charAt(l)))
    {
        l++;
    }
    while(l<r && !isAlphanum(s.charAt(r)))
    {
        r--;
    }
    if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
    {
        return false;
    }
    l++;
    r--;
 }
 return true;
    }
}