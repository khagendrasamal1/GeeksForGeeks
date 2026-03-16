#User function Template for python3

class Solution:
    def countPrimes(self,L,R):
        #code here
        def check_prime(n):
            if n <= 1:
                return False
                
            if n == 2:
                return True
                
            if n % 2 == 0:
                return False
                
            for i in range(3, int(n**0.5)+1, 2):
                if n % i == 0:
                    return False
            return True
                    
        cnt = 0
        for i in range(L, R+1):
            if check_prime(i):
                cnt += 1
                
        return cnt