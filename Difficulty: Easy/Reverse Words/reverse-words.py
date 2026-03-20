class Solution:
    def reverseWords(self, s):
        # code here
        new_sent = s.split('.')
        
        words = [w for w in new_sent if w]
        
        words.reverse()
        
        return '.'.join(words)
        