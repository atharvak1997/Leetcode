class Solution:
    
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        k = k % len(nums)
        left = 0
        right = len(nums) - 1

        nums = self.reverseN(nums, 0, len(nums) - 1)
        
        nums = self.reverseN(nums, 0, k - 1)

        nums = self.reverseN(nums, k, len(nums) - 1)

    def reverseN(self, nums, left, right):
            while left < right:
                nums[left], nums[right] = nums[right], nums[left]
                left += 1
                right -= 1
            return nums   
        
    
        