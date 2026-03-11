#User function Template for python3
class Solution:
	def removeVowels(self, s):
		# code here
		ans = ""
		
		for ch in s:
		    if ch not in "aeiou":
		        ans += ch
		        
		return ans