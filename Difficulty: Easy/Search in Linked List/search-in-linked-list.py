'''
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''

class Solution:
    def searchKey(self, head, key):
        #Code here
        curr = head
        while curr is not None:
            if key == curr.data:
                return True
            curr = curr.next
                
        return False
        