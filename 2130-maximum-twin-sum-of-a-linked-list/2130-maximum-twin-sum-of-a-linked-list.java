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
    public int pairSum(ListNode head) {
        int n = 0;
        int i = 0;
        int answer = 0;
        ListNode temp = head;
        ArrayList<Integer> arrL = new ArrayList<>();

        while(temp != null) {
            n++;
            arrL.add(temp.val);
            temp = temp.next;
        }

        while(i <= (n / 2) - 1) {
            answer = Math.max(answer, arrL.get(n - i - 1) + head.val);
            i++;
            head = head.next;
        }

        System.out.println(answer);

        return answer;

    }
}