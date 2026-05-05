##Structure of node
'''
class Node:
    def __init__(self, data=0):
        self.data=0
        self.left=None
        self.right=None
'''

class Solution:
    def sumOfLeafNodes(self, root):
        #Your code here
        if root is None:
            return 0
            
        if root.left is None and root.right is None:
            return root.data
            
        left_sum = self.sumOfLeafNodes(root.left)
        right_sum = self.sumOfLeafNodes(root.right)
        
        return left_sum + right_sum