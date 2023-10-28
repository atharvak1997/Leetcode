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
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while(list1 != null && list2 != null) {
            int v1 = list1.val;
            int v2 = list2.val;

            if(v1 >= v2) {
                ListNode new_node = new ListNode(v2);
                current.next = new_node;
                current = current.next;
                list2 = list2.next;
            }
            if (v1 < v2) {
                ListNode new_node = new ListNode(v1);
                current.next = new_node;
                current = current.next;
                list1 = list1.next;
            }
        }
            if(list1 != null) {
                current.next = list1;
            }
            if(list2 != null) {
                current.next = list2;
            }
        return dummy.next;
    }
}