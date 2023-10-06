class Solution:
    def isPalindrome(self, s: str) -> bool:
        letters = []

        for i in s:
            if i.isalnum():
                letters.append(i.lower())
        letters = "".join(letters)

        l, r = 0, len(letters) - 1
        while l <= r:
            if letters[l] != letters[r]:
                return False
            l += 1
            r -= 1
        return True