class Solution:
    def isSorted(self, arr) -> bool:
        # code here
        n = len(arr)
        
        is_sorted = True
        
        for i in range(n-1):
            if arr[i] > arr[i+1]:
                is_sorted = False
                break
        return is_sorted