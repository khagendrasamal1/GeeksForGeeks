#User function Template for python3
class Solution:
    def getMoreAndLess(self, arr, target):
		# code here
		larger = 0
		smaller = 0
		
		for num in arr:
		    if num >= target:
		        larger += 1
		    if num <= target:
		        smaller += 1
		        
		return [smaller, larger]