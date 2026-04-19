class Solution:
    def sumExceptFirstLast(self,arr):
        # Parr:  list of pair
        #code here
        n = len(arr)
        
        ans = 0
        
        for i in range(1, n-1):
            ans += arr[i]
            
        return ans