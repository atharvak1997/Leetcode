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
    public int[] nextLargerNodes(ListNode head) {
        ListNode start = head;
        ListNode temp = head;
        int count = 0;
        int i = 0;
        
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        
        while(head != null) {
            while(start != null) {
                if(start.val > head.val) {
                    arr[i] = start.val;
                    break;
                }
                start = start.next;
            }
            i++;
            head = head.next;
            start = head;
        }
        return arr;
    }
}