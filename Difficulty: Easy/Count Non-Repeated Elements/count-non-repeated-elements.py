class Solution:
    def countNonRepeated(self,arr):
        # code here
        freq = {}
        cnt = 0
        
        for num in arr:
            freq[num] = freq.get(num, 0)+1
            
        for num in freq:
            if freq[num] == 1:
                cnt += 1
                
                
        return cnt