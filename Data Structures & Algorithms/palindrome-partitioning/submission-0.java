class Solution {
    public static void fun(int ind,List<List<String>>ds,List<String>path,String s)
    {
        if(ind==s.length())
        {
            ds.add(new ArrayList<>(path));
            return;
        }
        for(int i =ind;i<s.length();i++)
        {
           if(isPalindrome(ind,i,s)==true)
           {
             path.add(s.substring(ind,i+1));
             fun(i+1,ds,path,s);
             path.remove(path.size()-1);
           }
        }
    }
    public static boolean isPalindrome(int start, int end, String s)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>>res= new ArrayList<>();
        List<String>path=new ArrayList<>();
        fun(0,res,path,s);
        return res;
        
        
    }
}
