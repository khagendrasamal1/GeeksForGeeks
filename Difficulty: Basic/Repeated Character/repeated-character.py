#User function Template for python3

class Solution:
    def firstRep(self, s):
        # code here
        counts = {}
        for char in s:
            counts[char] = counts.get(char, 0) + 1
            
        for char in s:
            if counts[char] > 1:
                return char
                
        return '#'