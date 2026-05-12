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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ArrayList<Integer>list = new ArrayList<>();
        while(temp1!=null)
        {
            list.add(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            list.add(temp2.val);
            temp2=temp2.next;
        }
        if(list.isEmpty())
        {
            return null;
        }
        else
        {
            Collections.sort(list);
        }
        ListNode newHead= new ListNode(list.get(0));
        ListNode newTemp=newHead;
        for( int i =1;i<list.size();i++)
        {
            newTemp.next= new ListNode(list.get(i));
            newTemp=newTemp.next;
        }
        return newHead;
    }
}