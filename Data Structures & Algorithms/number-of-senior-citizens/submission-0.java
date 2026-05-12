class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String s:details)
        {
            char tense=s.charAt(11);
            char ones=s.charAt(12);
            String age= "" + tense + ones;
            int a=Integer.parseInt(age);
            if(a>60)
            {
                cnt++;
            }
        }

        return cnt;
    }
}