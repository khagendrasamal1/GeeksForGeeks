class Solution:
    # your task is to complete this function
    # function should return false if length is even
    # else return true
    def isEven(self, head):
        # Code here
        cnt = 0
        curr = head
        
        while curr:
            cnt += 1
            curr = curr.next
            
        if cnt % 2 == 0:
            return True
        else:
            return False