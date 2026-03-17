class Solution:
    def remDuplicate(self, arr):
        # code here 
        n = len(arr)
        ans = []
        seen = set()
        
        for i in arr:
            if i not in seen:
                seen.add(i)
                ans.append(i)
                
        return ans
    