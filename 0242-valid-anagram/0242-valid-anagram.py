class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        smap = {}
        tmap = {}

        if len(s) != len(t):
            return False

        for i in s:
            if i in smap:
                smap[i] += 1
            else:
                smap[i] = 1
        
        for i in t:
            if i in tmap:
                tmap[i] += 1
            else:
                tmap[i] = 1
        print(smap)
        for i in smap:
            if i not in tmap or smap[i] != tmap[i]:
                return False
        return True