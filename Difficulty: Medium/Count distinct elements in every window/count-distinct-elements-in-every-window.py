class Solution:
    def countDistinct(self, arr, k):
        # Code here
        n = len(arr)
        
        freq = {}
        ans = []
        
        for i in range(k):
            freq[arr[i]] = freq.get(arr[i], 0) + 1
        
        ans.append(len(freq))
        
        for i in range(k, n):
            if freq[arr[i-k]] == 1:
                del freq[arr[i-k]]
            else:
                freq[arr[i-k]] -= 1
                
            freq[arr[i]] = freq.get(arr[i], 0) + 1
            
            ans.append(len(freq))
            
        return ans
        
        