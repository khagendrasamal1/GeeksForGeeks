#User function Template for python3

class Solution:
    def firstNegInt(self, arr, k): 
         # code here 
        n = len(arr)
         
        neg = []
        ans = []
         
        for i in range(k):
            if arr[i] < 0:
                neg.append(i)
                 
        if len(neg) > 0:
            ans.append(arr[neg[0]])
        else:
            ans.append(0)
            
        for i in range(k, n):
            if len(neg) > 0 and neg[0] <= i-k:
                neg.pop(0)
                
            if arr[i] < 0:
                neg.append(i)
                
            if len(neg) > 0:
                ans.append(arr[neg[0]])
            else:
                ans.append(0)
                
        return ans
            
        