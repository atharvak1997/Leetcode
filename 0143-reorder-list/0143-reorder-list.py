# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        if head.next and head.next.next:
            prev = head
            curr = head.next
            temp = head
            stack = []
            count = 0
            even = False

            while temp:
                stack.append(temp.val)
                temp = temp.next
                count += 1
            if count % 2 == 0:
                even = True
                count = count // 2
                count -= 1
            else:
                count = count // 2

            
            while count > 0:
                top = ListNode(stack.pop())
                link = prev.next
                prev.next = top
                top.next = link
                prev = curr
                curr = curr.next
                count -= 1
            if even:
                curr.next = None
            else:
                prev.next = None
