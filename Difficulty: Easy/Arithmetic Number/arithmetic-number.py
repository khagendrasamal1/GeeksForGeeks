#User function Template for python3

class Solution:
    def inSequence(self, a, b, c):
        # code here
        if c == 0:
            if a == b:
                return 1
            else:
                return 0
                
        diff = b-a
        
        if diff % c == 0 and diff // c >= 0:
            return 1
        
        return 0