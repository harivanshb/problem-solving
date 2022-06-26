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
    public ListNode middleNode(ListNode head) {
        ListNode headCopy;
        headCopy = head;
        int count =0,m;
        while(headCopy.next!=null){
            count++;
            headCopy = headCopy.next;
        }
        if(count%2!=0){
            m = count/2 +1;
        }
        else m = (count/2);
        System.out.println(m);
        while(m>0){
            head = head.next;
            m--;
        }
        return head;
    }
    
}