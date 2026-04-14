#User function Template for python3
class Solution:
    #Function to return kth largest element from an array.
    def kthLargest(self,arr,k):
        
        # code here
        min_heap = []
        
        for num in arr:
            heapq.heappush(min_heap, num)
            if len(min_heap) > k:
                heapq.heappop(min_heap)
        
        return min_heap[0]
        
        