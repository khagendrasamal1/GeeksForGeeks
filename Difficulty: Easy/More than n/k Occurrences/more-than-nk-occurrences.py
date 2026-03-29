class Solution:
    
    #Function to find all elements in array that appear more than n/k times.
    def countOccurence(self,arr, k):
        #Your code here
        n = len(arr)
        cnt = 0
        target = n//k
        
        freq = {}
        
        for num in arr:
            freq[num] = freq.get(num, 0)+1
            
        for num in freq:
            if freq[num] > target:
               cnt += 1
            
            
        return cnt