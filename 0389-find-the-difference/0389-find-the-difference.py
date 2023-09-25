class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        shash = {}
        thash = {}

        for chs in s:
            if chs in shash:
                shash[chs] += 1
            else:
                shash[chs] = 1
                
        for cht in t:
            if cht in thash:
                thash[cht] += 1
            else:
                thash[cht] = 1
        for cht in thash.keys():
            if cht not in shash or thash[cht] != shash[cht]:
                return cht