# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Requirement
    # Delete the middle node
    # Is there a case where the LinkedList is empty?
    # Will there be a cycle in the LinkedList?
# Design
    # 1st Solution:
        # 2 pass solution
            # In the 1st pass we will count number of elements, then divide by 2
            # In the 2nd go to the n - 1 element

    # 2nd Solution
        # Fast and slow pointers
        # Time complexity will O(n)
        # Space complexity will be O(1)
# Implement
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        # Case in which there is only one node
        if not head.next:
            return None
        slow = head
        fast = head.next.next

        # This part will make sure that slow pointer is behind the middle node
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

        # Delete the middle node
        slow.next = slow.next.next

        return head

# Test cases
# 1  3  4  7  8  9
#       ^S           ^F
# head = [1,3,4,7,1,2,6] result = [1,3,4,1,2,6]