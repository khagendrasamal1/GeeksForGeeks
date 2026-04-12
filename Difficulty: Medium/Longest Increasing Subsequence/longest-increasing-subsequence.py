class Solution:
    def lis(self, arr):
        # code here
        if not arr:
            return 0
            
        n = len(arr)
        
        dp = [1]*n
        
        for i in range(1, n):
            for j in range(i):
                if arr[i] > arr[j]:
                    dp[i] = max(dp[i], dp[j]+1)
                    
                    
        return max(dp)
        
       
