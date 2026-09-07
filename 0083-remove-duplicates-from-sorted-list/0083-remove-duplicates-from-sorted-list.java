/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode future;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode cur=head;
        ListNode future=head.next;

        while(future!=null)
        {
            if(cur.val!=future.val)
            {
                cur.next=future;
                cur=cur.next;
            }
            future = future.next;
        }
        cur.next=null;
        return head;
    }
}