class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        slen = len(s)
        tlen = len(t)
        s = sorted(s)
        t = sorted(t)
        i = 0

        while i < slen:
            if s[i] != t[i]:
                return t[i]
            i += 1
        return t[i]