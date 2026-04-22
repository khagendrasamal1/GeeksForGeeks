#User function Template for python3
class Solution:
	def maxRepeating(self,k, arr):
		# code here
		freq = [0]*k
		
		maxi = 0
		ans = 0
		
		for num in arr:
		    freq[num] += 1
		    
		for i in range(k):
		    if freq[i] > maxi:
		        maxi = freq[i]
		        ans = i
		        
		        
		return ans