class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>>mp=new HashMap<>();
        for( String s:strs)
        {
            char []arr=s.toCharArray();
            Arrays.sort(arr);
            String sortedstr=new String(arr);
            if(!mp.containsKey(sortedstr))
            {
                mp.put(sortedstr, new ArrayList<>());
            }
            mp.get(sortedstr).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
