'''
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def sortedArrayToBST(self, arr):
        # code here
        def build_bst(left, right):
            if left > right:
                return None
                
            mid = (left + right) // 2
            
            root = Node(arr[mid])
            
            root.left = build_bst(left, mid-1)
            root.right = build_bst(mid+1, right)
            
            return root
            
        return build_bst(0, len(arr)-1)