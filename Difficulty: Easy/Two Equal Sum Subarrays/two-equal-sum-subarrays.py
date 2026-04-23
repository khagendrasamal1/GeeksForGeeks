class Solution:
    def canSplit(self, arr):
        #code here
        n = len(arr)
        total = 0
        
        for num in arr:
            total += num
            
        if total % 2 != 0:
            return False
            
        curr = 0
        
        for i in range(n-1):
            curr += arr[i]
        
            if curr == total//2:
                return True
                
        return False
        