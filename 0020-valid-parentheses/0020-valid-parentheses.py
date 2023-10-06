class Solution:
    def isValid(self, s: str) -> bool:
        parent = {'}':'{', ']':'[', ')':'('}
        stack = []

        for i in s:
            if i in parent:
                if not stack or stack.pop() != parent[i]:
                    return False
            else:
                stack.append(i)
        if stack:
            return False
        return True