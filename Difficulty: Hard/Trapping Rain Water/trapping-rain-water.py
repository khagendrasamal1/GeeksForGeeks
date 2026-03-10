class Solution:
    def maxWater(self, arr):
        # code here
        n = len(arr)
        
        i = 0
        j = n-1
        
        max_left = 0
        max_right = 0
        water = 0
        
        while i < j:
            if arr[i] <= arr[j]:
                max_left = max(max_left, arr[i])
                water += max_left - arr[i]
                i += 1
            else:
                max_right = max(max_right, arr[j])
                water += max_right - arr[j]
                j -= 1
        
        return water
        