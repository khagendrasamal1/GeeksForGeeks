#User function Template for python3

class Solution:
    def firstIndex(self, arr):
    # Your code goes here

        ind = -1
    
        for i in range(len(arr)):
            if arr[i] == 1:
                ind = i
                break
        
        return ind