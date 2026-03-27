class Solution:
    def minDist(self, arr, x, y):
        
        n = len(arr)
        
        ind_x = -1
        ind_y = -1
        min_dist = float("inf")
        
        for i in range(n):
            if arr[i] == x:
                ind_x = i
            if arr[i] == y:
                ind_y = i
                
            if ind_x != -1 and ind_y != -1:
                min_dist = min(min_dist, abs(ind_x - ind_y))
        
        if min_dist != float('inf'):
            return min_dist
        else:
            return -1