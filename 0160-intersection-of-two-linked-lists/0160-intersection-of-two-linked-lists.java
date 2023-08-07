/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA), sizeB = getSize(headB);
        int diff = Math.abs(sizeA - sizeB);
        
        if(sizeA > sizeB) {
            while(diff != 0) {
                headA = headA.next;
                diff--;
            }
        }
        else if(sizeA < sizeB){
            while(diff != 0) {
                headB = headB.next;
                diff--;
            }
        }
        
        while(headA != null) {
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    
    private static int getSize(ListNode list) {
        int size = 0;
        while(list != null) {
            size++;
            list = list.next;
        }
        return size;
    }
}