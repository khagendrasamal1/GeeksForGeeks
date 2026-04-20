class Solution:
    def isDivBy8(self, s):
        # code here
        if len(s) >= 3:
            num = int(s[-3:])
        else:
            num = int(s)
            
        return num % 8 == 0