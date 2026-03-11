#User function Template for python3

class Solution:

    def Count(self, S):
        # code here
        cnt = 0
        
        for ch in S:
            if ('a' <= ch <= 'z') or ('A' <= ch <= 'Z'):
                cnt += 1
                
        return cnt