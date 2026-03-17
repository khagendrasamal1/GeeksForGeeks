class Solution:
	def twoSum(self, arr, target):
		# code here
		seen = set()
		
		for num in arr:
		    extra = target - num
		    
		    if extra in seen:
		        return True
		        break
		    seen.add(num)
		    
		return False