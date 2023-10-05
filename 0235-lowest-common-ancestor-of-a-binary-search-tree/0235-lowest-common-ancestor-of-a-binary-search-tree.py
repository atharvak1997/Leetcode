# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        leftarr = [p.val]
        rightarr = [q.val]

        def postorder(node, leftarr, rightarr):
            if not node:
                return None

            postorder(node.left, leftarr, rightarr)
            postorder(node.right, leftarr, rightarr)
            if node.left and node.left.val in leftarr or node.left and node.left.val in rightarr:
                leftarr.append(node.val)
                
            if node.right and node.right.val in rightarr or node.right and node.right.val in leftarr:
                rightarr.append(node.val)
                
        
        postorder(root, leftarr, rightarr)
        leftarr = sorted(leftarr)
        rightarr = sorted(rightarr)
        answer = root
        flag = False
        print(leftarr)
        print(rightarr)
        for i in leftarr:
            if i in rightarr:
                answer = TreeNode(i)
                flag = True
        if flag:
            return answer
        else:
            for l in range(len(leftarr)):
                if leftarr[l] in leftarr[l + 1:]:
                    answer = TreeNode(leftarr[l])
                    return answer
            for r in range(len(rightarr)):
                if rightarr[r] in rightarr[r + 1:]:
                    answer = TreeNode(rightarr[r])
                    return answer
            