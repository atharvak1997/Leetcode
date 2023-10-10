class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        left = 0
        right = 1
        maxD = -1

        while right < len(nums):
            currD = nums[right] - nums[left]
            if nums[left] < nums[right]:
                maxD = max(maxD, currD)
            else:
                left = right
            right += 1
        
        return maxD