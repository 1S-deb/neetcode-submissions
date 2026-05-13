class Solution {
    public static void fun(String s, int open, int close,int n,List<String>arr)
    {
        if(s.length()==2*n)
        {
            arr.add(s);
            return;
        }
        if(open<n)
        {
            fun(s+"(",open+1,close,n,arr);

        }
        if(close<open)
        {
            fun(s+")",open,close+1,n,arr);
        }
    }
    public List<String> generateParenthesis(int n) {
        String s="";
        List<String>arr=new ArrayList<>();
        fun(s,0,0,n,arr);
        return arr;
    }
}
