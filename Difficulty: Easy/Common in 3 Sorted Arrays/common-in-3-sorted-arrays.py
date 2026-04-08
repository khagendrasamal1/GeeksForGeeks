#User function Template for python3

class Solution:
    def commonElements(self, arr1, arr2, arr3):
        #Code Here
        n1 = len(arr1)
        n2 = len(arr2)
        n3 = len(arr3)
        
        i, j, k = 0, 0, 0
        
        ans = []
        
        while i < n1 and j < n2 and k < n3:
            if arr[i] == arr2[j] == arr3[k]:
                ans.append(arr1[i])
                common = arr1[i]
                
                while i < n1 and arr1[i] == common:
                    i += 1
                while j < n2 and arr2[j] == common:
                    j += 1
                while k < n3 and arr3[k] == common:
                    k += 1
                    
            elif arr1[i] < arr2[j]:
                i += 1
            elif arr2[j] < arr3[k]:
                j += 1
            else:
                k += 1
                
        return ans