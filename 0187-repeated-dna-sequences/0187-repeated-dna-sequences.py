class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        hashset = set()
        res = []
        for i in range(len(s) - 9):
            if s[i:i+10] in hashset:
                if s[i:i+10] not in res:
                    res.append(s[i:i+10])
            hashset.add(s[i:i+10])
        return res