class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        rmap = {}
        mmap = {}

        for r in ransomNote:
            if r in rmap:
                rmap[r] += 1
            else:
                rmap[r] = 1
        for m in magazine:
            if m in mmap:
                mmap[m] += 1
            else:
                mmap[m] = 1
        
        for i in ransomNote:
            if i not in mmap:
                return False
            if rmap[i] <= mmap[i]:
                continue
            else:
                return False
        return True