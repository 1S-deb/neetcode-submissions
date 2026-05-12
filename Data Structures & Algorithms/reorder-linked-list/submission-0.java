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
    public void reorderList(ListNode head) {
        ListNode temp =head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        ListNode arr[]=new ListNode[cnt];
        temp=head;
        for(int i =0;i<cnt;i++)
        {
            arr[i]=temp;
            temp=temp.next;
        }
        
        int l=0;
        int r=arr.length-1;
        while(l<r)

        {
            arr[l].next=arr[r];
            l++;
            if(l==r)
            {
                break;
            }
            arr[r].next=arr[l];
            r--;
        }
         arr[l].next=null;
        
       // return newNode;
    }
}
