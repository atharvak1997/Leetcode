class Solution:
    def maxProduct(self, words: List[str]) -> int:
        maxProd = 0
        flag = False
        new_words = []

        for s in words:
            temp = ["0"] * 26
            for i in s:
                temp[ord(i) - 97] = "1"
            temp = "".join(temp)
            new_words.append(temp)
        
        for k in range(len(new_words)):
            for m in range(k + 1, len(new_words)):
                res = int(new_words[k], 2) & int(new_words[m], 2)
                if res == 0:
                    maxProd = max(maxProd, len(words[k]) * len(words[m]))

        return maxProd