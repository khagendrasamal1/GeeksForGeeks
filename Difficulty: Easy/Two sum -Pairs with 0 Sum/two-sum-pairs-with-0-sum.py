#User function Template for python3

class Solution:
    def getPairs(self, arr):
        # code here
        seen = set()
        unique = set()
        
        for num in arr:
            diff = -num
            
            if diff in seen:
                pair = tuple(sorted((num, diff)))
                unique.add(pair)
                
            seen.add(num)
            
        ans = sorted([list(p) for p in unique])
            
        return ans