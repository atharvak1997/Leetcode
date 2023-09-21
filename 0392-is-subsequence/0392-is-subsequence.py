class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(t) < len(s):
            return False
        elif len(t) == len(s):
            if s == t:
                return True
            else:
                return False
        sp = 0
        tp = 0
        
        while sp < len(s) and tp < len(t):
            if s[sp] == t[tp]:
                sp += 1
            tp += 1
        if sp == len(s):
            return True
        return False
            