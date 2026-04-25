#User function Template for python3

class Solution:
    def commonElements(self,a,b):
        #code here
        a.sort()
        b.sort()
        
        ans = []
        
        i, j = 0, 0
        
        while i < len(a) and j < len(b):
            if a[i] == b[j]:
                ans.append(a[i])
                i += 1
                j += 1
                
            elif a[i] < b[j]:
                i += 1
            else:
                j += 1
                
        return ans