class Solution {
    public static void fun(int ind, String s,List<List<String>>list, List<String>arr )
    {
        if(ind>=s.length())
        {
            list.add(new ArrayList<>(arr));
        }
        for(int i =ind;i<s.length();i++)
        {
            if(isPalindrome(ind,i,s)==true)
            {
                //pick
                arr.add(s.substring(ind,i+1));
                fun(i+1,s,list,arr);
                arr.remove(arr.size()-1);
            }
        }
    }
  
    public static boolean isPalindrome(int start,int end,String str )
    {
        while(start<=end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>>list=new ArrayList<>();
        List<String>arr=new ArrayList<>();
        fun(0,s,list,arr);
        return list;
    }
}
