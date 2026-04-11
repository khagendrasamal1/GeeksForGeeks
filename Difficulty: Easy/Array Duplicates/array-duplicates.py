class Solution:
    def findDuplicates(self, arr):
        # code here
        ans = []
        
        for num in arr:
            idx = abs(num) - 1
            
            if arr[idx] < 0:
                ans.append(abs(num))
            else:
                arr[idx] = -arr[idx]
        
        return ans