//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            // Read the start times
            String[] startInput = reader.readLine().trim().split("\\s+");
            int[] start = new int[startInput.length];
            for (int i = 0; i < startInput.length; i++) {
                start[i] = Integer.parseInt(startInput[i]);
            }

            // Read the end times
            String[] endInput = reader.readLine().trim().split("\\s+");
            int[] finish = new int[endInput.length];
            for (int i = 0; i < endInput.length; i++) {
                finish[i] = Integer.parseInt(endInput[i]);
            }

            // Create solution object and call activitySelection
            Solution obj = new Solution();
            System.out.println(obj.activitySelection(start, finish));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = start.length;
        
        int a[][] = new int[n][3];
        
        for(int i=0; i<n; i++){
            a[i][0] = i+1;
            a[i][1] = start[i];
            a[i][2] = finish[i];
        }
        
        Arrays.sort(a, Comparator.comparingInt(o -> o[2]));
        
        int r = a[0][2];
        
        ans.add(a[0][0]);
        
        for(int i=1; i<a.length; i++){
            if(a[i][1] > r){
                ans.add(a[i][0]);
                r = a[i][2];
            }
        }
        return ans.size();
    }
}
