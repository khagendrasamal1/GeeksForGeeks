#User function Template for python3

class Solution:
	def reverseDigits(self, n):
		# Code here
		ans = 0
		
		while n > 0:
		    digit = n%10
		    ans = ans*10 + digit
		    n //= 10
		    
		return ans