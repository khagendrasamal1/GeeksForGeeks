#User function Template for python3

class Solution:
    def replaceWithRank(self, N, arr):
        # Code here
        n = len(arr)
        
        sorted_arr = sorted(arr)
        
        freq = {}
        r = 1
        
        for num in sorted_arr:
            if num not in freq:
                freq[num] = r
                r += 1
        
        for i in range(n):
            arr[i] = freq[arr[i]]
        
        return arr