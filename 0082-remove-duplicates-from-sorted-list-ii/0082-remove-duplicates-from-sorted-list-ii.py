# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        hashset = set()
        hashsettemp = set()
        cur = head
        dummy = ListNode()
        temp = dummy
        res = []
        
        while cur:
            if cur.val in hashset:
                hashsettemp.add(cur.val)
            else:
                hashset.add(cur.val)
            cur = cur.next
            
        for i in hashset:
            if i not in hashsettemp:
                res.append(i)
                
        res = sorted(res)
        for i in res:
            temp.next = ListNode(i)
            temp = temp.next
        return dummy.next