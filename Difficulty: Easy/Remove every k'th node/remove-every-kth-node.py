#Your task is to complete this function
#Your function should return the new head pointer
'''
class node:
    def __init__(self,x):
        self.data = x
        self.next = None
'''

class Solution:
    def deleteK(self, head, k):
        #code here  
        if not head or k <= 0:
            return head
            
        if k == 1:
            return None
            
        curr = head
        cnt = 1
        prev = None
        
        while curr:
            if k == cnt:
                prev.next = curr.next
                
                cnt = 1
            
            else:
                prev = curr
                cnt += 1
            
            curr = curr.next
            
        return head