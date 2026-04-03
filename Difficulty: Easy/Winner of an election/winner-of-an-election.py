#User function Template for python3

class Solution:
    
    #Complete this function
    
    #Function to return the name of candidate that received maximum votes.
    def winner(self,arr,n):
        # Your code here
        # return the name of the winning candidate and the votes he recieved
        freq = {}
        
        for char in arr:
            freq[char] = freq.get(char, 0)+1
            
        winner = ""
        votes = -1
        
        for name, cnt in freq.items():
            if cnt > votes:
                winner = name
                votes = cnt
            elif cnt == votes:
                if name < winner:
                    winner = name
                    
        return [winner, str(votes)]
        
        
        
