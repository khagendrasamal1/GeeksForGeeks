'''
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''

class Solution:
    def isSorted(self, head):
        # code here
        curr = head
        
        is_incr = True
        is_decr = True
        
        while curr.next:
            if curr.data > curr.next.data:
                is_incr = False
                
            if curr.data < curr.next.data:
                is_decr = False
                
            curr = curr.next
                 
        return is_incr or is_decr