#User function Template for python3

  
def Sandwiched_Vowel(s):
    #Complete the function
    n = len(s)
    vowels = 'aeiou'
    ans = ""
    
    for i in range(n):
        if s[i] in vowels:
            if i>0 and i<n-1:
                if s[i-1] not in vowels and s[i+1] not in vowels:
                    continue
                
        ans += s[i]
            
    return ans