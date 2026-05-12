class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i =0;i<strs[0].length();i++)
        {
            for(String s1:strs)
            {
                if(i==s1.length()||s1.charAt(i)!=strs[0].charAt(i))
                {
                    return s1.substring(0,i);
                }
            }
        }
        return strs[0];
    }
}