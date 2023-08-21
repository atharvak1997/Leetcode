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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> hashset = new HashSet<>();
        HashSet<Integer> hashsettemp = new HashSet<>();
        ListNode dummy = new ListNode();
        ListNode start = dummy;
        ListNode temp = head;
        
        while(temp != null) {
            if(hashset.contains(temp.val)) {
                hashsettemp.add(temp.val);
            }
            hashset.add(temp.val);
            temp = temp.next;
        }
        for(int i : hashsettemp) {
            hashset.remove(i);
        }
        
        List<Integer> list = new ArrayList<>(hashset);
        Collections.sort(list);
        for(int i : list) {
            start.next = new ListNode(i);
            start = start.next;
        }
        return dummy.next;
    }
}