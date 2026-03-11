#User function Template for python3

class Solution:
    def removeSpecialCharacter (self, S):
		#code here
		ans = ""
		
		for ch in S:
		    if ('a' <= ch <= 'z') or ('A' <= ch <= 'Z'):
		        ans += ch
		        
		if ans == "":
		    return -1
		else:
		    return ans