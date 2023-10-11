class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        total = 0
        maxT = nums[0]

        for i in range(len(nums)):
            total += nums[i]
            maxT = max(maxT, total)

            if total < 0:
                total = 0
        return maxT