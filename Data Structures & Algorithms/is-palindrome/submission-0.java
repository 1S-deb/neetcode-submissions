class Solution {
    public boolean isPalindrome(String s) {
        //ArrayList<Character>list=new ArrayList<>()
       StringBuilder ans=new StringBuilder();
        for(int i =0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                ans.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuilder ans2=new StringBuilder();
        for( int i =ans.length()-1;i>=0;i--)
        {
            ans2.append(ans.charAt(i));
        }
        if(ans.toString().equals(ans2.toString()))
        {
            return true;
        }
        return false;
    }
}
