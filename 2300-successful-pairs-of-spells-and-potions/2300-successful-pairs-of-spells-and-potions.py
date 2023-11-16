class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        answer = []
        potions = sorted(potions)

        for i, n in enumerate(spells):
            count = len(potions)
            l = 0
            r = len(potions) - 1

            while l <= r:
                mid = (r + l) // 2

                if n * potions[mid] >= success:
                    count = mid
                    r = mid - 1
                else:
                    l = mid + 1
            
            answer.append(len(potions) - count)
        
        return answer