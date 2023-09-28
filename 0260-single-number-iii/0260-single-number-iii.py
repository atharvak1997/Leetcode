class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        res = []
        i = 0
        nums = sorted(nums)
        
        while i < len(nums):
            if i < len(nums) - 1 and nums[i] == nums[i + 1]:
                i += 2
            else:
                res.append(nums[i])
                i += 1
        return res