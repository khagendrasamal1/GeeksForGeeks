
from typing import List


class Solution:
    def specialIntegers(self, n : int, arr : List[int]) -> int:
        # code here
        freq = {}
        ans = 0
        
        for num in arr:
            freq[num] = freq.get(num, 0)+1
            
        for num in freq:
            if num-1 in freq and num+1 in freq:
                ans += 1
        return ans
            
        
