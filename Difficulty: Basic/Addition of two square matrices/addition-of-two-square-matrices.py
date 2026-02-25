#User function Template for python3

class Solution:
	def Addition(self, matrixA, matrixB):
		# Code here
		n = len(matrixA)
		m = len(matrixB[0])
		
		for i in range(n):
		    for j in range(m):
		        matrixA[i][j] += matrixB[i][j]
		 
		return matrixA