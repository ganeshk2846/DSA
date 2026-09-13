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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1)
            return head;
            
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        int groups = count / k;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevGroupTail = dummy;
        cur = head;

        for (int i = 0; i < groups; i++) {
            ListNode groupTail = cur; 
            ListNode pre = null;
            ListNode nt = null;

            for (int j = 0; j < k; j++) {
                nt = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nt;
            }

            prevGroupTail.next = pre;
            groupTail.next = cur;
            prevGroupTail = groupTail;
        }

        return dummy.next;
    }
}
