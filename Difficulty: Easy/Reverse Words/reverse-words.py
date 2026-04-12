class Solution:
    def reverseWords(self, s):
        # code here
        parts = s.split('.')
        
        words = [w for w in parts if w]
        
        i = 0
        j = len(words)-1
        
        while i < j:
            words[i], words[j] = words[j], words[i]
            i += 1
            j -= 1
            
        return ".".join(words)
        