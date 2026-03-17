class Solution:
    def findUnion(self, a, b):
        # code here 
        ans = []
        
        i, j = 0, 0
        
        n = len(a)
        m = len(b)
        
        def add_ans(val):
            if not ans or ans[-1] != val:
                ans.append(val)
                
        
        while i < n and j < m:
            if a[i] < b[j]:
                add_ans(a[i])
                i += 1
            elif b[j] < a[i]:
                add_ans(b[j])
                j += 1
            else:
                add_ans(a[i])
                i += 1
                j += 1
                
        while i < n:
            add_ans(a[i])
            i += 1
            
        while j < m:
            add_ans(b[j])
            j += 1
            
        return ans