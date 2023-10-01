class Solution:
    def reverseWords(self, s: str) -> str:
        reverseString = s.split()
        
        for i in range(len(reverseString)):
            # temp = reverseString[i]
            reverseString[i] = reverseString[i][::-1]
        return " ".join(reverseString)