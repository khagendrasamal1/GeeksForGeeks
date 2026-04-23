#User function Template for python3

class Solution:
    def middle(self, a, b, c):
        #code here
        if a > b:
            if b > c:
                return b
            elif a > c:
                return c
            else:
                return a
                
        else:
            if a > c:
                return a
            elif b > c:
                return c
            else:
                return b
