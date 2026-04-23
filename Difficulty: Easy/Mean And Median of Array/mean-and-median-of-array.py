class Solution:
    def median(self, arr):
        #code here
        arr.sort()
        n = len(arr)
        
        if n % 2 != 0:
            return arr[(n//2)]
        else:
            return (arr[(n//2)] + arr[(n//2)-1]) // 2
    
    def mean(self, arr):
        #code here
        add = 0
        for num in arr:
            add += num
            
        return add // len(arr)