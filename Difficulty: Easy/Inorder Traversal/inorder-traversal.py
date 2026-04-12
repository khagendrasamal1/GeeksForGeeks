'''
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def inOrder(self, root):
        # code here
        ans = []
        
        def traverse(node):
            if not node:
                return
            
            traverse(node.left)
            ans.append(node.data)
            traverse(node.right)
            
        traverse(root)
        return ans
        