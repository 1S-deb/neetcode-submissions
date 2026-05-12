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
        if(head==null)
        {
            return null;
        }
        int cnt=0;
        ListNode temp=head;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        int arr[]=new int[cnt];
        temp=head;
        for(int i =0;i<cnt;i++)
        {
            arr[i]=temp.val;
            temp=temp.next;
        }
        int l=0;
        int r=cnt-1;
        while(l<r)
        {
            int temp1=arr[l];
            arr[l]=arr[r];
            arr[r]=temp1;
            l++;
            r--;
        }
        ListNode newNode =new ListNode(arr[0]);
        ListNode newNode_temp=newNode;
        for(int i =1;i<cnt;i++)
        {
        newNode_temp.next=new ListNode(arr[i]);
        newNode_temp=newNode_temp.next;
        }
        return newNode;
    }
}
