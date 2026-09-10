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

        ListNode temp=head;
        int count=1;

        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        
        if(n==count)
            return head.next;

        n=count-n;
        count=1;
        temp=head;
        while(count<n)
        {
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;

        return head;
    }
}