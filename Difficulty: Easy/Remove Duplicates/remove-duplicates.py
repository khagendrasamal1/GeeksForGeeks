#User function Template for python3
class Solution:
	def removeDups(self, str):
		# code here
		seen = set()
		arr = []
		
		for ch in s:
		    if ch not in seen:
		        seen.add(ch)
		        arr.append(ch)
		        
		ans = "".join(arr)
		
		return ans