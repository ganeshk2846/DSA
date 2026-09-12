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
    private ListNode findMid(ListNode node)
    {
        ListNode slow=node;
        ListNode fast=node.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode a,ListNode b)
    {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while(a!=null && b!=null)
        {
            if(a.val<b.val)
            {
                temp.next=a;
                temp=temp.next;
                a=a.next;
            }
            else
            {
                temp.next=b;
                temp=temp.next;
                b=b.next;
            }
        }
        if(a!=null)
            temp.next=a;
        else
            temp.next=b;

        return dummy.next;

    }
    
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode mid = findMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null; 
        
        left = sortList(left);
        right = sortList(right);
        
        return merge(left, right);

    }
}