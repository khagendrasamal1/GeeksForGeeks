class Solution:
    def maxLen(self, arr):
        # code here
        n = len(arr)
        
        prefix_sum = 0
        max_len = 0
        
        mp = {}
        mp[0] = -1
        
        for i in range(n):
            if arr[i] == 0:
                prefix_sum += -1
            else:
                prefix_sum += 1
                
            if prefix_sum in mp:
                length = i - mp[prefix_sum]
                if length > max_len:
                    max_len = length
            else:
                mp[prefix_sum] = i
                
        return max_len
            