'''
class Node:
    def __init__(self,data):
        self.data=data
        self.next=None
'''
class Solution:
    def compare(self, head1, head2):
        # code here
        while head1 is not None and head2 is not None:
            if head1.data > head2.data:
                return 1
            elif head2.data > head1.data:
                return -1
                
            head1 = head1.next
            head2 = head2.next
            
        if head1 is None and head2 is None:
            return 0
                
        if head1 is None:
            return -1
            
        return 1