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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int n = 0;
        
        while(temp !=null) {
            temp = temp.next;
            n++;
        }
        
        int elements = n / k;
        int parts = n % k;

        ListNode[] ans = new ListNode[k];
        temp = head;
        for (int i = 0; i < k; ++i) {
            ListNode root = new ListNode(0), write = root;
            for (int j = 0; j < elements + (i < parts ? 1 : 0); ++j) {
                write = write.next = new ListNode(temp.val);
                if (temp != null) temp = temp.next;
            }
            ans[i] = root.next;
        }
        return ans;   
    }
}