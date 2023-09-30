class Solution:
    def finalString(self, s: str) -> str:
        res = ""
        l, r = 0, 0

        while r < len(s):
            if s[r] == 'i':
                res = res[::-1]
            else:
                res += s[r]
            r += 1
        return res
