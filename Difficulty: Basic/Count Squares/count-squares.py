#User function Template for python3

class Solution:
    def countSquares(self, n):
        # code here 
        if n <= 1:
            return 0
            
        ans = (n-1) ** 0.5
        
        return int(ans)