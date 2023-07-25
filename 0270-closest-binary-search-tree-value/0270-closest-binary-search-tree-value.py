# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

            
    def closestValue(self, root: Optional[TreeNode], target: float) -> int:
        res = []
        
        if root == None:
                return
            
        def inorder(node):
            if node:
                inorder(node.left)
                res.append(node.val)
                inorder(node.right)
        inorder(root)
        key = [-1]
        minDiff = 99999999999
        for i in res:
            result = abs(target - i)
            if result < minDiff:
                key[0] = i
                minDiff = result    
        return key[0]