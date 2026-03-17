class Solution:    
    def findUnion(self, a, b):
        # code here
        union_set = set(a) | set(b)
        
        return list(union_set)