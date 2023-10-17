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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;
        
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                ListNode next = new ListNode(list2.val);
                head.next = next;
                head = next;
                list2 = list2.next;
            } else if (list2 == null) {
                ListNode next = new ListNode(list1.val);
                head.next = next;
                head = next;
                list1 = list1.next;
            } else if (list1.val == list2.val) {
                ListNode next1 = new ListNode(list1.val);
                ListNode next2 = new ListNode(list2.val);
                head.next = next1;
                head = next1;
                head.next = next2;
                head = next2;
                list1 = list1.next;
                list2 = list2.next;
            } else if (list1.val < list2.val) {
                ListNode next = new ListNode(list1.val);
                head.next = next;
                head = next;
                list1 = list1.next;
            } else {
                ListNode next = new ListNode(list2.val);
                head.next = next;
                head = next;
                list2 = list2.next;
            }
        }
        return dummyHead.next;
    }
}