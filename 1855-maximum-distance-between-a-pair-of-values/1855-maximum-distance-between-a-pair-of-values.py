class Solution:
    def maxDistance(self, nums1: List[int], nums2: List[int]) -> int:
        i = 0
        j = 0
        maxD = 0

        while j < len(nums2) and i < len(nums1):
            if nums1[i] <= nums2[j]:
                maxD = max(maxD, j - i)
                j += 1
            else:
                i += 1
                j += 1
        return maxD