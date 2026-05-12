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

// class Solution {
//     public boolean hasCycle(ListNode head) {
//         HashSet<ListNode>set=new HashSet<>();
//         ListNode temp=head;
//         while(temp!=null)
//         {
//             if(set.contains(temp))
//             {
//                 return true;
//             }
//             set.add(temp);
//             temp=temp.next;

//         }
//         return false;

//     }
// }
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                return true;
            }
        }
        return false;
    }
}