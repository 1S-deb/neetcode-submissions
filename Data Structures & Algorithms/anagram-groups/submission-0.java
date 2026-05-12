class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>mp=new HashMap<>();
        for( String str:strs)
        {
            char[]charArray= str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr= new String(charArray);
            if(!mp.containsKey(sortedStr))
            {
                mp.put(sortedStr,new ArrayList<>());
            }
            mp.get(sortedStr).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
