'''
class Node:
    def __init__(self, x):
        self.data = x
        self.next = None
'''

class Solution:
    def printList(self, head):
        # code here
        ans = []
        
        curr = head
        
        while curr:
            ans.append(curr.data)
            curr = curr.next
            
        return ans