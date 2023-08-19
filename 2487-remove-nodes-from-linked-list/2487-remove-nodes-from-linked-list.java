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
    public ListNode removeNodes(ListNode head) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0, head);
        ListNode prev = null;
        int maxVal = 0;
        ListNode newL = new ListNode(0);
        ListNode newList = newL;
        ListNode next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while(prev != null) {
            if(prev.val >= maxVal) {
                maxVal = prev.val;
                newL.next = new ListNode(prev.val);
                newL = newL.next;
            }
            prev = prev.next;
        }

        ListNode newN = null;
        ListNode curN = newList.next;
        ListNode prevN = null;
        while(curN != null) {
            newN = curN.next;
            curN.next = prevN;
            prevN = curN;
            curN = newN;
        }
        return prevN;
    }
}