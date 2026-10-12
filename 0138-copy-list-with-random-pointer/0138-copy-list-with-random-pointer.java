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
        Node temp = head;
        while(temp !=null){
            Node copy = new Node(temp.val);
            Node save = temp.next;
            temp.next = copy;
            copy.next = save;
            temp = temp.next.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        Node t1 = head;
Node t2 = head.next;
Node shead = head.next;

while (t1 != null) {

    // Restore original list
    t1.next = t1.next.next;

    // Fix copied list next pointer
    if (t2.next != null) {
        t2.next = t2.next.next;
    }

    // Move both pointers forward
    t1 = t1.next;
    t2 = t2.next;
}

return shead;
    }
}