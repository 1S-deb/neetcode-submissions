/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       List<Integer>list=new ArrayList<>();
       ListNode temp=head;
       int cnt=0;
       while(temp!=null)
       {
         
            list.add(temp.val);
         
         temp=temp.next;
       }
       list.remove(list.size()-n);
       if(list.size()==0)
       {
        return null;
       }
       ListNode newNode = new ListNode(list.get(0));
       ListNode newTemp=newNode;
       for( int i =1;i<list.size();i++)
       {
         newTemp.next = new ListNode(list.get(i));
         newTemp=newTemp.next;
       }
       return newNode;
    }
}
