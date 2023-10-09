class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l, r = 0, len(nums) - 1
        res = [-1, -1]

        while l <= r:
            mid = (l + r) // 2
            print(mid)
            if nums[mid] == target:
                left = mid
                right = mid
                if left > 0 and nums[left - 1] == target:
                    while left > 0 and nums[left] == target:
                        left -= 1
                    res[0] = left + 1
                else:
                    res[0] = mid

                if right == len(nums) - 1:
                    res[1] = right
                elif right < len(nums) and nums[right + 1] == target:    
                    while right < len(nums) and nums[right] == target:
                        right += 1
                    res[1] = right - 1
                else:
                    res[1] = mid
            if nums[mid] < target:
                l = mid + 1
            else:
                r = mid - 1
        return res