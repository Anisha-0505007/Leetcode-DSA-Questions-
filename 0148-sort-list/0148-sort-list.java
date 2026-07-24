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
    public ListNode sortList(ListNode head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        // 1. Split the list into two halves using slow/fast pointers
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null; // Break the connection

        // 2. Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // 3. Merge the two sorted halves
        return merge(left, right);
    }

    // Helper to find the middle node (prev to mid for proper split)
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next; // Start fast at head.next to get left middle for even lengths

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper to merge two sorted lists
    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return dummy.next;
    }
}