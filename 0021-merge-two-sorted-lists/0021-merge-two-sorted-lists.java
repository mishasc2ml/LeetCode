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
                head.next = list2;
                head = list2;
                list2 = list2.next;
            } else if (list2 == null) {
                head.next = list1;
                head = list1;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                head.next = list1;
                head = list1;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            } else {
                head.next = list1;
                head = list1;
                list1 = list1.next;
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        return dummyHead.next;
}
}