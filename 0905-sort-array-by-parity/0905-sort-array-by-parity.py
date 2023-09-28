class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        resE = []
        resO = []

        for i, n in enumerate(nums):
            if n % 2 == 0:
                resE.append(n);
            else:
                resO.append(n)
                
        for i in resO:
            resE.append(i)
        return resE