# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        l1 = headA
        l2 = headB
        countA = 0
        countB = 0

        while l1:
            countA += 1
            l1 = l1.next
        while l2:
            countB += 1
            l2 = l2.next
        final = abs(countA - countB)
        
        if countA > countB:
            while final:
                headA = headA.next
                final -= 1
        if countB > countA:
            while final:
                headB = headB.next
                final -= 1
        while headA and headB:
            if headA == headB:
                return headA
            headA = headA.next
            headB = headB.next
        return None