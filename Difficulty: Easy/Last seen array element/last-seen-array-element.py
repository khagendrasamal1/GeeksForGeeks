#User function Template for python3

class Solution:
      
    def lastSeenElement(self, arr): 
          
        # Complete the function
        occur = {}
        
        for index, value in enumerate(arr):
            occur[value] = index
            
        ans = min(occur, key=occur.get)
        
        return ans
