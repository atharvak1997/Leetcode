/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean cyclefound = false;
        
        if(head == null) {
            return null;
        }
        
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cyclefound = true;
                break;
                }
            }
        if(!cyclefound) {
            return null;
        }
        
        fast = head;
        while(slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}