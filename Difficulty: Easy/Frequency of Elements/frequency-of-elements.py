class Solution:
    def countFreq(self, arr):
        #code here
        freq = {}
        
        for num in arr:
            freq[num] = freq.get(num, 0)+1
            
        keys = list(freq.keys())
        
        ans = []
        
        for key in keys:
            ans.append([key, freq[key]])
            
        return ans