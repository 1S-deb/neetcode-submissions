class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer>list=new ArrayList<>();
        for( int num:stones)
        {
            list.add(num);
        }
        while(list.size()>1)
        {
            Collections.sort(list);
            int a=list.remove(list.size()-1);
            int b =list.remove(list.size()-1);
            if(a!=b)
            {
                list.add(Math.abs(a-b));
            }
        }
        if(list.size()==0)
        {
            return 0;
        }
        else
        return list.get(0);
    }
}
