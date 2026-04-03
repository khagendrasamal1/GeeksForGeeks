class Solution:
    def getOddOccurrence(self, arr):
        # code here 
        ans = arr[0]
        freq = {}
        
        for num in  arr:
            freq[num] = freq.get(num, 0)+1
            
        for num in freq:
            if freq[num] % 2 != 0:
                ans = num
                
        return ans