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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode headsm = new ListNode(0);
        ListNode headbg = new ListNode(0);
        
        
        headsm = small;
        headbg = big;
        while(head != null) {
            if(head.val < x) {
                headsm.next = head;
                headsm = headsm.next;
            } else {
                headbg.next = head;
                headbg = headbg.next;
            }
            head = head.next;
        }
        headbg.next = null;
        headsm.next = big.next;
        
        return small.next;
    }
}