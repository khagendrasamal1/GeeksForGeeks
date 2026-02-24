class Solution:
    def getSecondLargest(self, arr):
        # Code Here
        largest = arr[0]
        sec = -1
        
        for num in arr:
            if num > largest:
                sec = largest
                largest = num
            elif num > sec and num != largest:
                sec = num
                
        return sec