#User function Template for python3


class Solution:
    
    #Function to find the minimum element in sorted and rotated array.
    def minNumber(self, arr,low,high):
        #Your code here
        mini = arr[0]
        
        for num in arr:
            if num < mini:
                mini = num
        
        return mini