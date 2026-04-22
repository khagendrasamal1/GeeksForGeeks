#User function Template for python3
class Solution:

	def fascinating(self,n):
	    # code here
	    temp = str(n) + str(n*2) + str(n*3)
	    
	    if len(temp) != 9:
	        return False
	        
	    if "".join(sorted(temp)) == "123456789":
	        return True
	        
	    return False