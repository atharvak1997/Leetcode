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
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        ListNode res = new ListNode(0);
        int sum1 = 0;
        ListNode finalH = res;
        
        while(head != null) {
            while(head.val != 0) {
                inner.add(head.val);
                head = head.next;
            }
            if(!inner.isEmpty()) arr.add(inner);
            inner = new ArrayList<>();
            head = head.next;
        }
        
        for(ArrayList i : arr) {
            for(int j = 0; j < i.size(); j++) {
                sum1 += (int) i.get(j);
            }
            finalH.next = new ListNode(sum1);
            finalH = finalH.next;
            System.out.println(sum1);
            sum1 = 0;
        }
        return res.next;
    }
}