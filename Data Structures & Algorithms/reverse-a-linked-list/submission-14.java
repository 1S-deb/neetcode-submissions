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
    public ListNode reverseList(ListNode head) {
        Stack<Integer>stk=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            stk.push(temp.val);
            temp=temp.next;
        }
        if(stk.isEmpty())
        {
            return null;
        }
        ListNode newHead= new ListNode (stk.pop());
        ListNode newTemp=newHead;
        while(!stk.isEmpty())
        {
            newTemp.next= new ListNode(stk.pop());
            newTemp=newTemp.next;
        }
        return newHead;
    }
}
