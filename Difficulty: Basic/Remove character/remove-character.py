#User function Template for python3

class Solution:
    def removeChars (ob, str1, str2):
        # code here 
        ans = ""
        
        for ch in str1:
            if ch not in str2:
                ans += ch
                
        return ans