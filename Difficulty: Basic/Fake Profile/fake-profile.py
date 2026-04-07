#User function Template for python3

class Solution:

    def solve(self, a):
        # code here
        seen = set()
        
        for char in a:
            if char not in 'aeiou':
                seen.add(char)
                
        if len(seen)%2 == 0:
            return "SHE!"
            
        return "HE!"