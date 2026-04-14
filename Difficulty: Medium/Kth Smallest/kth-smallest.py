class Solution:
    def kthSmallest(self, arr, k):
        # Code here
        max_heap = []
        
        for num in arr:
            heapq.heappush(max_heap, -num)
            if len(max_heap) > k:
                heapq.heappop(max_heap)
                
        return -max_heap[0]
        
