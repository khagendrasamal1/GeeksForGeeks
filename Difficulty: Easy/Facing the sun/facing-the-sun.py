#User function Template for python3

class Solution:
    # Returns count buildings that can see sunlight
    def countBuildings(self, height):
        # code here
        n = len(height)
        ans = 1
        max_ht = height[0]
        
        for i in range(1, n):
            if height[i] > max_ht:
                ans += 1
                
                max_ht = height[i]
        
        return ans