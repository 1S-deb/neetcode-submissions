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
        ListNode dummy = new ListNode(-1);
        ListNode newTemp=dummy;
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                newTemp.next=temp1;
                newTemp=temp1;
                temp1=temp1.next;
            }
            else
            {
                newTemp.next=temp2;
                newTemp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1!=null)
        {
            newTemp.next=temp1;
        }
        else
        {
            newTemp.next=temp2;

        }
        return dummy.next;

    }
}