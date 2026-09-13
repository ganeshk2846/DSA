/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        Node t1 = head;
        while (t1 != null) {
            Node temp = new Node(t1.val);
            temp.next = t1.next;
            t1.next = temp;
            t1 = temp.next; 
        }
        
        t1 = head;
        while (t1 != null) {
            if (t1.random != null) {
                t1.next.random = t1.random.next; 
            }
            t1 = t1.next.next; 
        }
        
        t1 = head;
        Node dummy = new Node(-1);
        Node t2 = dummy;
        
        while (t1 != null) {
            Node nextOriginal = t1.next.next; 
           // Node cloneNode = t1.next;          
            t2.next = t1.next;
            t2 = t1.next;
        
            t1.next = nextOriginal;
            t1 = nextOriginal;
        }
        
        return dummy.next;
    }
}
