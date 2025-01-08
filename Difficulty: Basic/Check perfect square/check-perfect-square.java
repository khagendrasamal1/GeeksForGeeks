//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isPerfectSquare(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long isPerfectSquare(long n){
        // code here
        if (n < 1) return 0;

        long left = 1, right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == n) {
                return 1; 
            } else if (square < n) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return 0;
    }
}