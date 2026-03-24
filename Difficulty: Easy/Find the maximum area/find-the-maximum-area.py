#User function Template for python3
class Solution:
    def maxArea(self, arr):
        #code
        greatest = arr[0]
        
        for num in arr:
            if num > greatest:
                greatest = num
        
        return greatest * greatest