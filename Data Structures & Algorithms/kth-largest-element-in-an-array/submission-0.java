class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>minqueue= new PriorityQueue<>();
        for ( int num:nums)
        {
            minqueue.offer(num);
            if(minqueue.size()>k)
            {
                minqueue.poll();
            }
        }
        return minqueue.peek();
    }
}
