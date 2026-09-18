class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;

        
        for (int i = 1; i < left; i++) {
            prev = temp;
            temp = temp.next;
        }

        
        ListNode connection = prev;      
        ListNode tail = temp;            

        
        for (int i = 0; i <= right - left; i++) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        // Reconnect
        if (connection != null) {
            connection.next = prev;
        } else {
            head = prev;
        }

        tail.next = temp;

        return head;
    }
}