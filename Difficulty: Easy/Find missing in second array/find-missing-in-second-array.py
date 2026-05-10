#User function Template for python3


class Solution:
    def findMissing(self,a,b):
    # code here
        ans = []
        
        set_b = set(b)
        
        for num in a:
            if num not in set_b:
                ans.append(num)
                
        return ans
