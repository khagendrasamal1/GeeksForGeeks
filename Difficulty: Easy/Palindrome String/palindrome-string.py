class Solution:
    def isPalindrome(self, s):
        # code here
        n = len(s)
        
        i = 0
        j = n - 1
        
        isPalindrome = True
        
        while i < j:
            if s[i] != s[j]:
                isPalindrome = False
                break
            
            i += 1
            j -= 1
            
        return isPalindrome
        
