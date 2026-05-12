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
        ListNode temp=list1;
        
        ArrayList<Integer>list=new ArrayList<>();
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        temp=list2;
        
        while(temp!=null)
        {
          list.add(temp.val);
            temp=temp.next;
        }
       
        Collections.sort(list);
        if(list.isEmpty())
        {
            return null;
        }
        ListNode newNode = new ListNode(list.get(0));
        ListNode newTemp=newNode;
        for( int i =1;i<list.size();i++)
        {
            newTemp.next = new ListNode(list.get(i));
            newTemp = newTemp.next;
        }
        return newNode;
    }
}