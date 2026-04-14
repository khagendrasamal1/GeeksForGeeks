#User function Template for python3

class Solution:

    def encryptString(self, s):
        # code here
        n = len(s)
        ans = []
        i = 0
        
        while i < n:
            curr_char = s[i]
            cnt = 0
            
            while i < n and s[i] == curr_char:
                cnt += 1
                i += 1
                
            ans.append(curr_char)
            ans.append(str(cnt))
            
        encrypt = "".join(ans)
        return encrypt[::-1]