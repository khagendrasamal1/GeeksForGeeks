class Solution:
	def twoSum(self, arr, target):
		# code here
		freq = {}
		
		for i, num in enumerate(arr):
		    diff = target - num
		    
		    if diff in freq:
		        return True
		        
		    freq[num] = i
		    
		return False