#User function Template for python3

class Solution:
    def countWords(self,List, n):
        #code here
        freq = {}
        cnt = 0
        
        for word in List:
            freq[word] = freq.get(word, 0)+1
            
        for word in freq:
            if freq[word] == 2:
                cnt += 1
                
        return cnt