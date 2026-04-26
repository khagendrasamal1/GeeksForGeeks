"""
You're given an array (arr)
Return the frequency of element x in the given array
"""
class Solution:
    def findFrequency(self, arr, x):
        # code here
        cnt = 0
        
        for num in arr:
            if num == x:
                cnt += 1
                
        return cnt