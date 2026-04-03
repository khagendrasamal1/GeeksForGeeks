#User function Template for python3

class Solution:
    #Complete the below function
    def search(self,arr, x):
        #Your code here
        ans = -1
        for i in range(len(arr)):
            if arr[i] == x:
                ans = i
                break
            
        return ans