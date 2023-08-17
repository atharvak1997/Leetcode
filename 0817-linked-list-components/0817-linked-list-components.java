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
    public int numComponents(ListNode head, int[] nums) {
        List<List<Integer>> arrList = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        ArrayList<Integer> lists = new ArrayList<>(nums.length);
        for (int num : nums) {
            lists.add(num);
        }

        while(head != null) {
            while(head != null && lists.contains(head.val)) {
                
                inner.add(head.val);
                head = head.next;
            }
            if(!inner.isEmpty()) arrList.add(inner);
            inner = new ArrayList<>();
            if(head != null) head = head.next;
            
        }
        return arrList.size();
    }
}