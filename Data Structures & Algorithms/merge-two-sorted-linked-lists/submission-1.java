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
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode temp=list1;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        temp=list2;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        if(arr.isEmpty())
        {
            return null;
        }
        ListNode newNode =new ListNode(arr.get(0));
        ListNode newtemp=newNode;
        for(int i =1;i<arr.size();i++)
        {
            newtemp.next=new ListNode(arr.get(i));
            newtemp=newtemp.next;
        }
        return newNode;
    }
}