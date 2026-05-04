'''
# Node Class:
class Node:
    def __init__(self,val):
        self.data = val
        self.left = None
        self.right = None
'''
        
# Return True if the given Binary Tree is a Full Binary Tree. Else return False
def isFullTree(root):
    #code here
    
    if root is None:
        return True
        
    if root.left is None and root.right is None:
        return True
        
    if root.left is not None and root.right is not None:
        return isFullTree(root.left) and isFullTree(root.right)
        
    return False