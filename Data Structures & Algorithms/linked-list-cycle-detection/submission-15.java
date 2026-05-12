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
    public boolean hasCycle(ListNode head) {
//         HashMap<ListNode,Integer>mp=new HashMap<>();
//         ListNode temp=head;
//         while(temp!=null)
//         {
//             if(mp.containsKey(temp))
//             {
//                 return true;
//             }
//             mp.put(temp,mp.getOrDefault(temp,0)+1);
//             temp=temp.next;
//         }
//         return false;
//     }
// }
// HashSet<ListNode>set=new HashSet<>();
// ListNode temp=head;
// while(temp!=null)
// {
//     if(set.contains(temp))
//     {
//         return true;
//     }
//     set.add(temp);
//     temp=temp.next;
// }
// return false;
//     }
// }
ArrayList<ListNode>list=new ArrayList<>();
ListNode temp=head;
while(temp!=null)
{
    if(list.contains(temp))
    {
        return true;
    }
    list.add(temp);
    temp=temp.next;
}
return false;
    }
}
