//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            int ans[] = ob.nearestPerfectSquare(N);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] nearestPerfectSquare(int N) {
        // code here
        int sqrtFloor = (int) Math.sqrt(N);
        
        int lower = sqrtFloor * sqrtFloor;
        int upper = (sqrtFloor + 1)  * (sqrtFloor + 1);
        
        int lowerDiff = Math.abs(N- lower);
        int upperDiff = Math.abs(N - upper);
        
        if(lowerDiff <= upperDiff){
            return new int[]{lower, lowerDiff};
        }else{
            return new int[]{upper, upperDiff};
        }
    }
}