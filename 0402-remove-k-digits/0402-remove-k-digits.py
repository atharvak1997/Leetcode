class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stack = []

        for i in num:
            
            while k > 0 and stack and stack[-1] > i:
                stack.pop()
                # stack.append(i)
                k -= 1
                
            stack.append(i)
        stack = stack[:len(stack) - k]
        res = "".join(stack)
        if res:
            for i, s in enumerate(res):
                if s != '0':
                    break
            return res[i:]
        else:
            return "0"