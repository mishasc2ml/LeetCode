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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        
        while(newHead != null && newHead.next != null) {
            if (newHead.val == newHead.next.val) {
                newHead.next = newHead.next.next;
            } else {
                newHead = newHead.next;
            }
        }
        return head;
    }
}