class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        i = 0

        if i < len(nums) - 1 and nums[i] <= nums[len(nums) - 1]:
            for i in range(len(nums)):
                if i < len(nums) - 1 and nums[i] > nums[i + 1]:
                    return False
        elif i < len(nums) - 1 and nums[i] > nums[len(nums) - 1]:
            for i in range(len(nums)):
                if i < len(nums) - 1 and nums[i] < nums[i + 1]:
                    return False
        
        return True