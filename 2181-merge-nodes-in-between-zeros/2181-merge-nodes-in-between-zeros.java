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
        // ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        // ArrayList<Integer> inner = new ArrayList<>();
        ListNode res = new ListNode(0);
        ListNode finalres = head;
        int sum1 = 0;
        ListNode finalH = res;
        
        while(finalres != null) {
            while(finalres.val != 0) {
                sum1 += finalres.val;
                finalres = finalres.next;
            }
            if(sum1 != 0) {
                finalH.next = new ListNode(sum1);
                finalH = finalH.next;
            }
            sum1 = 0;
            finalres = finalres.next;
            
        }
        
        
        return res.next;
    }
}