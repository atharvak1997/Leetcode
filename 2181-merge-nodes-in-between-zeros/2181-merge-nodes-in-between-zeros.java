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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode start = head;
        ListNode end = head.next;
        
        while(end != null) {
            System.out.println(end.val);
            while(end.val != 0) {
                sum += end.val;
                end = end.next;
            }
            ListNode middle = new ListNode(sum);
            sum = 0;
            start.next = middle;
            middle.next = end;
            start = end;
            end = end.next;
        }

        ListNode last = head;

        while(last.next != null && last.next.next != null) {
            if(last.val != 0) {
                last.next = last.next.next;
            }
            last = last.next;
        }
        last.next = null;
        return head.next;
    }
}