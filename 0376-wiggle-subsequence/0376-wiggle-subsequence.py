class Solution:
    def wiggleMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 1
        count = 1
        flag = None


        i = 1
        for i in range(1, len(nums)):
            if flag != -1 and nums[i] - nums[i - 1] < 0:
                    count += 1
                    flag = -1
                    i += 1

            elif flag != 1 and nums[i] - nums[i - 1] > 0:
                    count += 1
                    flag = 1
                    i += 1

        return count

        