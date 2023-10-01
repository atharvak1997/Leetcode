class Solution:
    def removeDigit(self, number: str, digit: str) -> str:
        maxres = 0

        for i in range(len(number)):
            if number[i] == digit:
                temp = int(number[:i] + number[i + 1:])
                maxres = max(maxres, temp)
        return str(maxres)