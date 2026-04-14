#User function Template for python3

class Solution:
    def checkCompressed(self, S, T):
        # code here 
        i = 0
        j = 0
        n = len(S)
        m = len(T)
        
        while j < m:
            if T[j].isdigit():
                num = 0
                
                while j < m and T[j].isdigit():
                    num = num * 10 + int(T[j])
                    j += 1
                    
                i += num
                
            else:
                if i >= n or S[i] != T[j]:
                    return 0
                i += 1
                j += 1
                
        return 1 if i == n else 0