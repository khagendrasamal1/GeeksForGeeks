#User function Template for python3
class Solution:

	def equilibrium(self,arr): 
    	# code here
    	n = len(arr)
    	
    	total = 0
    	left = 0
    	right = 0
    	
    	for num in arr:
    	    total += num
    	  
    	for i in range(n):
    	    right = total - left - arr[i]
    	    
    	    if left == right:
    	        return "true"
    	        break
    	    
    	    left += arr[i]
    	    
    	  
    	
    	return "false"