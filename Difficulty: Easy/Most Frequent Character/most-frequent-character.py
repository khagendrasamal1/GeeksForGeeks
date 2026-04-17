class Solution:
    def getMaxOccurringChar(self, s):
        #code here
        freq = {}
        
        for ch in s:
            freq[ch] = freq.get(ch, 0)+1
            
        maxi = 0
        ans = ''
        
        for ch in sorted(freq.keys()):
            if freq[ch] > maxi:
                maxi = freq[ch]
                ans = ch
                
        return ans