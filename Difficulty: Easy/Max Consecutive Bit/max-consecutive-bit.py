class Solution:
    def maxConsecBits(self, arr):
        #code here 
        n = len(arr)
        ans = 1
        cnt = 1
        
        for i in range(1, n):
            if arr[i] == arr[i-1]:
                cnt += 1
            else:
                cnt = 1
                
            if cnt > ans:
                ans = cnt
        
        return ans