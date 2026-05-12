class Solution {
    public boolean alphanum(char s)
    
    {
        if(s>='A'&& s<='Z'||s>='a'&&s<='z'||s>='0'&& s<='9')
              
              {
                return true;
              }

    
    return false;
     
    }
    public boolean isPalindrome(String s) {
        StringBuilder str= new StringBuilder();
        for( int i =0;i<s.length();i++)
        {
            if( alphanum(s.charAt(i)))
            {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}
