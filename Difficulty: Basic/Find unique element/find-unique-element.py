class Solution:
    def find_unique(self, k, arr):
        #code here
        freq = {}
        ans = 0
        
        for num in arr:
            freq[num] = freq.get(num, 0)+1
            
        for num in freq:
            if freq[num] == 1:
                ans = num
                
        return ans