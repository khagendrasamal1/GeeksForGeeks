class Solution:
    def nonRepeatingChar(self,s):
        #code here
        arr = [0] * 26
        
        for ch in s:
            index = ord(ch) - ord('a')
            arr[index] += 1
            
        for ch in s:
            index = ord(ch) - ord('a')
            if arr[index] == 1:
                return ch
                break
            
        else:
            return '$'
        
    
    