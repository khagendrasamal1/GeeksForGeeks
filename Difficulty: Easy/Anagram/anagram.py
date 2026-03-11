class Solution:
    def areAnagrams(self, s1, s2):
       # code here
        if len(s1) != len(s2):
           return False
           
        arr = [0] * 26
        
        for ch in s1:
            index = ord(ch) - ord('a')
            arr[index] += 1
            
        for ch in s2:
            index = ord(ch) - ord('a')
            arr[index] -= 1
            
        isAnagram = True
        
        for i in arr:
            if i != 0:
                isAnagram = False
                break
            
        return isAnagram
       