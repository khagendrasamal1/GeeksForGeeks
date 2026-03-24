#User function Template for python3
class Solution:
	
	def findSum(self,arr):
		# code here
		disc = set(arr)
		
		cnt = 0
		
		for num in disc:
		    cnt += num
		    
		return cnt