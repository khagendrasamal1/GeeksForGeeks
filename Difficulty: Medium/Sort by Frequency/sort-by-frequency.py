class Solution:
    def frequencySort(self, s):
        # code here
        freq = {}
        
        for char in s:
            freq[char] = freq.get(char, 0)+1
            
        def get_freq(item):
            return (item[1], item[0])
            
        sorted_items = sorted(freq.items(), key=get_freq)
        
        result = []
        
        for char, cnt in sorted_items:
            result.append(char*cnt)
            
        return "".join(result)