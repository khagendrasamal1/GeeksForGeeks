#User function Template for python3

class Solution:
    def distinctCount(self, arr):
        # code here
        distinct = set(arr)
        cnt = 0
        
        for num in distinct:
            if num > 0:
               cnt += 1
               
        return cnt