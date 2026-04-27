class Solution:
    def nonRepeatingChar(self,s):
        #code here
        freq = {}
        
        for ch in s:
            freq[ch] = freq.get(ch, 0)+1
            
        for ch in s:
            if freq[ch] == 1:
                return ch
                
        return -1
    
    