# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, linkedListOne: ListNode, linkedListTwo: ListNode) -> Optional[ListNode]:
        count1 = 0
        count2 = 0

        l1 = linkedListOne
        l2 = linkedListTwo

        while l1:
            count1 += 1
            l1 = l1.next

        while l2:
            count2 += 1
            l2 = l2.next
        final = abs(count1 - count2)
        if count1 > count2:
            while final:
                final -= 1
                linkedListOne = linkedListOne.next

        elif count2 > count1:
            while final:
                final -= 1
                linkedListTwo = linkedListTwo.next

        while linkedListOne and linkedListTwo:
            if linkedListOne == linkedListTwo:
                return linkedListOne
            linkedListOne = linkedListOne.next
            linkedListTwo = linkedListTwo.next

        return None