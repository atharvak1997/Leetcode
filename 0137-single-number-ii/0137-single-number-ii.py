class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        hashmap = {}
        
        for i in nums:
            if i not in hashmap:
                hashmap[i] = 1
            else:
                hashmap[i] += 1
        
        for i in nums:
            if hashmap[i] != 3:
                return i