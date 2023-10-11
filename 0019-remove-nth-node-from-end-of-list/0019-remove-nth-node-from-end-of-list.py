# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Requirement
    # We want to return such a linked list which does not have the nth node in it
    # Given : nth node to remove
    # Questions : Does Linked List have cycles? 
                # Will the nth node be out of bounds?
                # Will head be empty?

# Design
    # Use a two pointer approach   
    # One pointer will be the head and another will be the previous node
    #    1  2  3  4  5 , n = 2 result =  1 2 3 5
    #  p^      h^
    # Time complexity = O(n)
    # Space complexity = O(1)

# Implement
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n:int) -> Optional[ListNode]:
        # Dummy will be returned as the answer
        dummy = ListNode(next=head)
        prev = dummy

        # Offset head by n positions
        while n > 0:
            head = head.next
            n -= 1
        
        # Move prev pointer to a location just behind the nth node
        while head:
            head = head.next
            prev = prev.next
        # Remove the node next to prev node
        prev.next = prev.next.next

        return dummy.next

# Testing
#    1  2  4  8  0, n = 3
#^D         ^p            ^h

        