class Solution:
    def maxProfit(self,prices):
        left = 0
        right = 1
        maxP = 0

        while right < len(prices):
            currentP = prices[right] - prices[left]
            if prices[left] < prices[right]:
                maxP = max(maxP, currentP)
            else:
                left = right
            right += 1

        return maxP
            