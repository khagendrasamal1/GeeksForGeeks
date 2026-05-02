class Solution:
    def deleteMid(self, stack):
        #code here
        size = len(stack)
        
        if size == 0:
            return s
            
        mid = (size+1) // 2
        
        s = []
        
        pops = size - mid
        
        for i in range(pops):
            s.append(stack.pop())
        
        stack.pop()
        
        while s:
            stack.append(s.pop())
            
        return stack