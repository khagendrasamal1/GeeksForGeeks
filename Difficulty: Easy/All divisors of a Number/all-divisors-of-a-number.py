#User function Template for python3

class Solution:
    def print_divisors(self, N):
        # code here
        ans = []
        for i in range(1, int(N**0.5)+1):
            if N % i == 0:
                ans.append(i)
                
                if i*i != N:
                    ans.append(N//i)
                    
                    
        ans.sort()
        
        for a in ans:
            print(a, end=" ")