class Solution:
    def reverseVowels(self, s: str) -> str:
        l = 0
        r = len(s) - 1
        vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}
        res = []
        for i in s:
            res.append(i)

        while l <= r:
            if res[l] in vowels:
                if res[r] in vowels:
                    res[l], res[r] = res[r], res[l]
                    l += 1
                    r -= 1
                else:
                    r -= 1
            else:
                l += 1
        return "".join(res)
