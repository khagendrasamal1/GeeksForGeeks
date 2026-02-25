#User function Template for python3

class Solution:
    #Function to check if a is a subset of b.
    def isSubset(self, a, b):
        # Your code here
        n = len(a)
        m = len(b)
        
        freq = {}
        
        for num in a:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1
                
        is_subset = True
        
        for num in b:
            if num in freq and freq[num] > 0:
                freq[num] -= 1
            else:
                is_subset = False
                
        
        return is_subset
    
    
    
    
