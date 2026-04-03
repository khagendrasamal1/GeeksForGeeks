#User function Template for python3

class Solution:
    def lastIndex(self, s: str) -> int:
        # code here
        n = len(s)
        ind = -1
        
        for i in range(n-1, -1, -1):
            if s[i] == '1':
                ind = i
                break
                
        return ind
        
        
