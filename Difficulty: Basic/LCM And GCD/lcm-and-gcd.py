class Solution:
    def lcmAndGcd(self, a : int, b : int) -> List[int]:
        # code here
        def GCD(a, b):
            while b != 0:
                a, b = b, a%b
            return a
        
        gcd_ab = GCD(a, b)
        
        lcm_ab = (a*b) // gcd_ab
        
        return [lcm_ab, gcd_ab]