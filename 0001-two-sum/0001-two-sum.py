class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {}
        for i, a in enumerate(nums):
            sum = target - a
            if sum in dict:
                return [i, dict[sum]]
            else:
                dict[a] = i
                