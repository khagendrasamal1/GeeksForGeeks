//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution ob = new Solution();

            if (ob.equalPartition(arr))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int n = arr.length;
        int totalSum = 0;
        
        for(int i=0; i<n; i++){
            totalSum += arr[i];
        }
        
        if(totalSum %2 == 1){
            return false;
        }
        
        int target = totalSum/2;
        
        boolean dp[] = new boolean[target+1];
        dp[0] = true;
        
        for(int num : arr){
            for(int j=target; j>=num; j--){
                dp[j] = dp[j] || dp[j-num];
            }
        }
        return dp[target];
    }
}