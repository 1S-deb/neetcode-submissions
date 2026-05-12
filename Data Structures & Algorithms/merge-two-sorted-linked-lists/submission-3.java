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
        ArrayList<Integer>lis=new ArrayList<>();
        ListNode temp1=list1;
        while(temp1!=null)
        {
            lis.add(temp1.val);
            temp1=temp1.next;
        }
        ListNode temp2=list2;
        while(temp2!=null)
        {
            lis.add(temp2.val);
            temp2=temp2.next;
        }
        if(lis.isEmpty())
        {
            return null;
        }
        Collections.sort(lis);
        ListNode newNode =new ListNode(lis.get(0));
        ListNode newtemp=newNode;
        for(int i =1;i<lis.size();i++)
        {
            newtemp.next=new ListNode(lis.get(i));
            newtemp=newtemp.next;
        }
        return newNode;

    }
}