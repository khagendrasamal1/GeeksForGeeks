"""
class Node:
    def __init__(self, val):
        self.data = val
        self.next = None
"""

class Solution:
    def reverseList(self, head):
        # Code here
        curr = head
        prev = None
        front = None
        
        while curr:
            front = curr.next
            curr.next = prev
            prev = curr
            curr = front
        
        return prev