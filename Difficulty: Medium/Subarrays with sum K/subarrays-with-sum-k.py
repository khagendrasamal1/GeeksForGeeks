class Solution:
    def cntSubarrays(self, arr, k):
        # code here
        prefix_sum = {0: 1}
        
        curr_sum = 0
        count = 0
        
        for num in arr:
            curr_sum += num
            
            target = curr_sum - k
            if target in prefix_sum:
                count += prefix_sum[target]
            
            
            prefix_sum[curr_sum] = prefix_sum.get(curr_sum, 0)+1
            
        return count