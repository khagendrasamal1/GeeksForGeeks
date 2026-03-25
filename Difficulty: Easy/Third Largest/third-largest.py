class Solution:
    def thirdLargest(self,arr):
        # code here
        if len(arr) < 3:
            return -1

        first = float('-inf')
        second = float('-inf')
        third = float('-inf')
    
        for num in arr:
            if num >= first:
                third = second
                second = first
                first = num
            elif num >= second:
                third = second
                second = num
            elif num >= third:
                third = num
    
        return third