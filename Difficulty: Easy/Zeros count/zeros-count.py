#User function Template for python3

class Solution:
    def countZeroes(self, arr):
        # code here
        n = len(arr)
        cnt = 0
        
        for num in reversed(arr):
            if num == 0:
                cnt += 1
                
        return cnt