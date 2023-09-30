class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        reverseStr = ""
        res = ""
        j = 0
        count = 0

        for c in s:
            if c.isalpha():
                reverseStr += c
        reverseStr = reverseStr[::-1]

        for c in s:
            if not c.isalpha():
                while count > 0:
                    res += reverseStr[j]
                    j += 1
                    count -= 1
                res += c
                count = 0
            else:
                count += 1
        
        
        while count > 0:
            res += reverseStr[j]
            j += 1
            count -= 1
        return res
            
