class Solution:
    def wiggleMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 1
        count = 1
        
        if nums[1] - nums[0] < 0:
            flag = -1
            count += 1
            if len(nums) == 2:
                return len(nums)
        elif nums[1] - nums[0] > 0:
            flag = 1
            count += 1
            if len(nums) == 2:
                return len(nums)
        else:
            print("yes")
            flag = 0
            if len(nums) == 2:
                return len(nums) - 1
        
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

        