# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        q = deque([root])
        res = []

        while q:
            level = []
            for i in range(len(q)):
                node = q.popleft()

                if node:
                    q.append(node.left)
                    q.append(node.right)
                    level.append(node.val)
            res.append(level)
        print(res)

        answer = []
        for i in res:
            if i:
                answer.append(i[-1])
        return answer