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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        ListNode answer = odd;
        ListNode even = new ListNode();
        ListNode evenStart = even;
        boolean flag = false;

        while(head != null) {
            if(flag == false) {
                ListNode temp = new ListNode(head.val);
                odd.next = temp;
                odd = odd.next;
                flag = true;
            }
            else {
                ListNode temp = new ListNode(head.val);
                even.next = temp;
                even = even.next;
                flag = false;
            }
            head = head.next;
        }

        odd.next = evenStart.next;

        return answer.next;
    }
}