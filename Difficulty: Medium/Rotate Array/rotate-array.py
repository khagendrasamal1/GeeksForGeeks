class Solution:
    def rotateArr(self, arr, d):
        #Your code here
        n = len(arr)
        d = d % n
        
        self.reverse(arr, 0, d-1)
        self.reverse(arr, d, n-1)
        self.reverse(arr, 0, n-1)
        
        
    def reverse(self, arr, i, j):
        while i < j:
            arr[i], arr[j] = arr[j], arr[i]
            i += 1
            j -= 1