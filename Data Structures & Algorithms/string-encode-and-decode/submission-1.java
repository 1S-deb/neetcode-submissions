class Solution {

    public String encode(List<String> strs) {
     StringBuilder sb= new StringBuilder();
      for( String x:strs)
      {
        sb.append(x.length()).append("#").append(x);
      }
      return sb.toString();
    }

    public List<String> decode(String str) {
     int i =0;
     List<String>res= new ArrayList<>();
     while(i<str.length())
     {
        int j =i;
        while(str.charAt(j)!='#')
        {
            j++;
        }
        int len = Integer.parseInt(str.substring(i,j));
        j++;
        String word= str.substring(j,j+len);
        res.add(word);
        i=j+len;

     }
     return res;
    }
}
