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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashset = new HashSet<>();
        
        while(head != null) {
            if(hashset.contains(head)) {
                return true;
            }
            hashset.add(head);
            head = head.next;
        }
        return false;
    }
}