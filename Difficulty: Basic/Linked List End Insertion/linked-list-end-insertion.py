'''    
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''

class Solution:
    def insertAtEnd(self, head, x):
        #code here 
        new = Node(x)
        
        if head is None:
            return new
            
        temp = head
        
        while temp.next is not None:
            temp = temp.next
            
        temp.next = new
        
        return head
        