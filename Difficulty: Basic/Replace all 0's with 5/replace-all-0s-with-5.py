# Function should return an integer value
class Solution:
    def convertFive(self, n):
        # Code here
        if n == 0:
            return 5
            
        temp = n
        add = 0
        
        while temp > 0:
            digit = temp % 10
            if digit == 0:
                add = add * 10 + 5
            else:
                add = add * 10 + digit
                
            temp //= 10
            
        rev = 0
        while add > 0:
            digit = add % 10
            rev = rev * 10 + digit
            add //= 10
            
        return rev