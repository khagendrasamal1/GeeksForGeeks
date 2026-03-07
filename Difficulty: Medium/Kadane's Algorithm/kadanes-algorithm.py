class Solution:
    def maxSubarraySum(self, arr):
        # Code here
        n = len(arr)
        
        curr = arr[0]
        max_sum = arr[0]
        
        for i in range(1, n):
            curr = max(arr[i], curr + arr[i])
            max_sum = max(curr, max_sum)
            
        return max_sum