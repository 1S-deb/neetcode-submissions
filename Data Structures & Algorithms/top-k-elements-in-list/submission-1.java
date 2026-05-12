class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer>mp=new HashMap<>();
       ArrayList<Integer>list=new ArrayList<>();
       for( int num:nums)
       {
        mp.put(num, mp.getOrDefault(num,0)+1);
       }
       PriorityQueue<Map.Entry<Integer,Integer>>minHeap=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
       for(Map.Entry<Integer,Integer>e:mp.entrySet()){
        minHeap.add(e);
        
        if(minHeap.size()>k)
        {
           minHeap.poll();
        }
       }
        int arr[]=new int[k];
        int i =0;
        for( Map.Entry<Integer,Integer>entry:minHeap)
        {
            arr[i++]=entry.getKey();
        }
        return arr;
       }
    }
