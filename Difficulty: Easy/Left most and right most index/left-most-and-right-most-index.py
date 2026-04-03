#User function Template for python3

class Solution:
    def indexes(self, v, x):
        # Your code goes here
        first = -1
        last = -1
        
        for i in range(len(v)):
            if v[i] == x:
                first = i
                break
            
        for i in range(len(v)-1, -1, -1):
            if v[i] == x:
                last = i
                break
            
        return [first, last]