class Solution:
    def longestSubarray(self, arr, k):  
        # code here
        ans = 0
        freq = {}
        curr = 0
        
        n = len(arr)
        
        for i in range(n):
            curr += arr[i]
            
            if curr == k:
                ans = i+1
                
            if curr-k in freq:
                ans = max(ans, i - freq[curr-k])
                
            if curr not in freq:
                freq[curr] = i
            
        
        return ans