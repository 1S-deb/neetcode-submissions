class Solution {
    private List<String>res= new ArrayList<>();
    private String[]digitToChar={
        "","","abc","def","ghi","jkl","mno","qprs","tuv","wxyz"};
    
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
        {
            return res;
        }
        backtrack(0,"",digits);
        return res;
    }
    public  void backtrack(int ind, String curr, String digits)
    {
        if(curr.length()==digits.length())
        {
            res.add(curr);
            return ;
        }
        String chars= digitToChar[digits.charAt(ind)-'0'];
        for(char c:chars.toCharArray())
        {
            backtrack(ind+1,curr+c,digits);
        }
    }
}
