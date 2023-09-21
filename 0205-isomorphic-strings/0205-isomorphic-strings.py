class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map1 = {}
        map2 = {}
        s1 = 0
        t1 = 0

        for st in s:
            if st not in map1:
                if t[t1] in map2 and map2[t[t1]] != st:
                    return False
                map1[st] = t[t1]
                
                map2[t[t1]] = st
            else:
                if map1[st] != t[t1]:
                    return False
            t1 += 1
        return True
