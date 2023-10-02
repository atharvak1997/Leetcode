# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        
        def postorder(node, maxDepth):
            if not node:
                return 0
            
            left = postorder(node.left, maxDepth)
            right = postorder(node.right, maxDepth)
            maxDepth = max(maxDepth, max(left, right) + 1)
            
            return max(left, right) + 1
        
        maxDepth = 0
        return postorder(root, maxDepth)