"""
class Node:
    def __init__(self, value):
        self.data = value
        self.left = None
        self.right = None
"""

class Solution:
    def levelOrder(self, root):
        # code here
        if not root:
            return []
            
        result = []
        queue = deque([root])
        
        while queue:
            level_size = len(queue)
            curr_level = []
            
            for _ in range(level_size):
                node = queue.popleft()
                curr_level.append(node.data)
                
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                    
            result.append(curr_level)
            
        return result
        