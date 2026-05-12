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
        int cnt=0;
        if(head==null)
        {
            return null;
        }
        ListNode temp=head;
        while(temp!=null)
        { cnt++;
            temp=temp.next;
           
        }
       
        int arr[]=new int[cnt];
         temp=head;
        for( int i =0;i<cnt;i++)
        {
            arr[i]=temp.val;
            temp=temp.next;
        }
        int l =0;
        int r= arr.length-1;
        while(l<r)
        {
            int x= arr[l];
            arr[l]=arr[r];
            arr[r]=x;
            l++;
            r--;
        }
        ListNode newNode = new ListNode(arr[0]);
        ListNode newtemp=newNode;
        for( int i =1;i<arr.length;i++)
        {
            newtemp.next = new ListNode(arr[i]);
            newtemp=newtemp.next;
        }
        return newNode;

    }
}
