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
//       ListNode temp = head;
//       ArrayList<Integer>list =new ArrayList<>();
//       while(temp!=null){
//       list.add(temp.val);
//       temp=temp.next;
//       }
//       list.remove(list.size()-n);
//       if(list.isEmpty())
//       {
//         return null;
//       }
//       ListNode newHead = new ListNode(list.get(0));
//       ListNode newTemp=newHead;
//       for( int i=1;i<list.size();i++)
//       {
//         newTemp.next = new ListNode(list.get(i));
//         newTemp = newTemp.next;
//       }
//       return newHead;
// }
// }
ListNode dummy = new ListNode(0);
dummy.next =head;
ListNode first= dummy;
ListNode second=dummy;
for( int i =0;i<=n;i++)
{
    first=first.next;
}
while(first!=null)
{
    first=first.next;
    second=second.next;
}
second.next= second.next.next;
return dummy.next;
    }
}