# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True

        def isSame(leftroot, rightroot):
            if not leftroot and not rightroot:
                return True
            elif not leftroot or not rightroot:
                return False
            elif leftroot.val != rightroot.val:
                return False
            
            return isSame(leftroot.left, rightroot.right) and isSame(leftroot.right, rightroot.left)
        
        return isSame(root.left, root.right)
        