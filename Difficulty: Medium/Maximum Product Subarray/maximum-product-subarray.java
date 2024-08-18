//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        if(arr == null || n == 0){
            return 0;
        }
        
        long max = arr[0];
        long min = arr[0];
        long globalMax = arr[0];
        
        for(int i=1; i<n; i++){
            long curr = arr[i];
            
            
            if(curr < 0){
                long temp = max;
                max = min;
                min = temp;
            }    
                
                max = Math.max(curr, curr*max);
                min = Math.min(curr, curr*min);
                
                globalMax = Math.max(max, globalMax);
        }
        return globalMax;
    }
}