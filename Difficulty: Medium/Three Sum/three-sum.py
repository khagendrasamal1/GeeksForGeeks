

class Solution:
    def triplets(self, arr ):
        # code here
        arr.sort()
        
        ans = []
        
        for i in range(len(arr)):
            if arr[i] > 0:
                break
            
            if i > 0 and arr[i] == arr[i-1]:
                continue
            
            j, k = i+1, len(arr)-1
            
            while j < k:
                three_sum = arr[i] + arr[j] + arr[k]
                
                if three_sum < 0:
                    j += 1
                elif three_sum > 0:
                    k -= 1
                else:
                    ans.append([arr[i], arr[j], arr[k]])
                    j += 1
                    k -= 1
                    while j < k and arr[j] == arr[j-1]:
                        j += 1
                        
        return ans
        
