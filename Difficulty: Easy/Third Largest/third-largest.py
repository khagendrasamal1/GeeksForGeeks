class Solution:
    def thirdLargest(self,arr):
        # code here
        lar = sec_lar = thi_lar = float('-inf')
        
        for num in arr:
            if num > lar:
                thi_lar = sec_lar
                sec_lar = lar
                lar = num
            elif num > sec_lar:
                thi_lar = sec_lar
                sec_lar = num
            elif num > thi_lar:
                thi_lar = num
                
        if thi_lar != float('-inf'):
            return thi_lar
        else:
            return -1