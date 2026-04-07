class Solution:
    def minIndexChar(self,s1,s2): 
        #code here
        for i in range(len(s1)):
            if s1[i] in s2:
                return i
                
        return -1