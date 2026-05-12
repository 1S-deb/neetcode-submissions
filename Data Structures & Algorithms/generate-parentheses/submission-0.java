class Solution {
    public static void solve( String curr, int open, int close,int n ,List<String>res)
    {
        if(curr.length()==2*n)
        {
            res.add(curr);
            return ;
        }
        if(open<n)
        {
            solve(curr+"(",open+1,close,n,res);
        }
        if(close<open)
        {
            solve(curr+")",open,close+1,n,res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        String curr="";
        solve(curr,0,0,n,res);
        return res;
    }
}
