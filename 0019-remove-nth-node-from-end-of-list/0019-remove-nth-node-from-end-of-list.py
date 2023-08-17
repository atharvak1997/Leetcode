# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(next=head)
        current = dummy
        if head:
            while n :
                if head != None:
        	        head = head.next
        	        n -= 1
                else:
                    return -1
        
        while head:
            head = head.next
            current = current.next
        current.next = current.next.next

        return dummy.next