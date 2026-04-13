class Solution:
    # Function to calculate factorial of a number.
    def factorial(self, n: int) -> int:
        # code here
        fact = 1
        
        for i in range(1, n+1):
            fact *= i
            
        return fact