class Solution:
    def maxProfit(self, prices):
        # code here
        n = len(prices)
        
        max_profit = 0
        min_price = prices[0]
        
        for i in range(1, n):
            if prices[i] < min_price:
                min_price = prices[i]
            else:
                profit = prices[i] - min_price
                if profit > max_profit:
                    max_profit = profit
        
        return max_profit