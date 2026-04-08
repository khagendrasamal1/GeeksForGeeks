#User function Template for python3
class Solution: 
    def firstAndLast(self, x, arr): 
        # Code here
        first, last = -1, -1
        
        for i in range(len(arr)):
            if arr[i] == x:
                first = i
                break
                
        for i in range(len(arr)-1, -1, -1):
            if arr[i] == x:
                last = i
                break
            
        if first != -1 and last != -1:
            return [first, last]
        
        return [-1]