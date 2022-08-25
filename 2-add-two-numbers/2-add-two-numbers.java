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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(0);
        ListNode dummy = new ListNode();
        dummy = current;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1, val2 = 0;
            if (l1 == null) {
                val1 = 0;
            } else val1 = l1.val;

            if (l2 == null) {
                val2 = 0;
            } else val2 = l2.val;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            ListNode insert = new ListNode(sum);

            current.next = insert;

            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}
