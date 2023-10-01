class Solution:
    def decodeString(self, s: str) -> str:
        stack = []
        
        for i in s:
            if i != ']':
                stack.append(i)
            else:
                substr = ""
                while stack[-1] != '[':
                    substr = stack.pop() + substr
                stack.pop()
                
                k = ""
                while stack and stack[-1].isdigit():
                    k = stack.pop() + k
                k = int(k)
                while k > 0:
                    stack.append(substr)
                    k -= 1
        
        return "".join(stack)
                