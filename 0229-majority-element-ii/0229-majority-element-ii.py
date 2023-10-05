class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        hashmap = {}
        res = []

        for i in nums:
            if i in hashmap:
                hashmap[i] += 1
            else:
                hashmap[i] = 1
        n = len(nums) / 3
        for i in hashmap:
            if hashmap[i] > n:
                res.append(i)
        return res