class Solution:
    def canAttend(self, arr):
        # Code Here
        arr.sort(key = lambda x : x[0])
        
        
        for i in range(1, len(arr)):
            previous = arr[i-1][1]
            current = arr[i][0]
            
            if current < previous:
                return False
        
        return True
        