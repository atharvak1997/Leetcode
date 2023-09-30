class Solution:
    def reorderSpaces(self, text: str) -> str:
        textArr = text.split()
        spaces = 0
        endSpaces = 0
        res = ""
        n=1

        for c in text:
            if c == " ":
                spaces += 1
        if len(textArr) == 1:
            n = 1
        else:
            n = len(textArr) - 1
        middleSpaces = spaces // n
        
        
        for i in range(len(textArr) - 1):
            middleSpaces = spaces // n
            res += textArr[i]

            while middleSpaces > 0:
                res += " "
                middleSpaces -= 1
        
        res += textArr[len(textArr) - 1]
        
        middleSpaces = spaces // (n)
        endSpaces = spaces - middleSpaces*(len(textArr) - 1)
        print(endSpaces)
        while endSpaces > 0:
            res += " "
            endSpaces -= 1
        return res