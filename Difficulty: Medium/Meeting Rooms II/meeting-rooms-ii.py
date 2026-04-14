class Solution:
    def minMeetingRooms(self, start, end):
        # code here
        start.sort()
        end.sort()
        
        n = len(start)
        
        start_ptr = 0
        end_ptr = 0
        
        room = 0
        max_room = 0
        
        while start_ptr < n:
            if start[start_ptr] < end[end_ptr]:
                room += 1
                start_ptr += 1
            else:
                room -= 1
                end_ptr += 1
                
            max_room = max(max_room, room)
            
        return max_room