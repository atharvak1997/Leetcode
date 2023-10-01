class Solution:
    def monotoneIncreasingDigits(self, n: int) -> int:
        strn = list(str(n))
        flag = len(strn)

        for i in range(flag-1,0,-1):
            if strn[i] < strn[i-1]:
                flag = i
                strn[i-1] = str(int(strn[i-1]) -1)
                
        for i in range(flag, len(strn)):
            strn[i] = '9'

        return int("".join(strn))