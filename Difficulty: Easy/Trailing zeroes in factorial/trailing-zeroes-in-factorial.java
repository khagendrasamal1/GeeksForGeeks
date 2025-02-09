//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.trailingZeroes(N);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int trailingZeroes(int n) {
        // Write your code here
        int ans = 0;
        
        while(n > 0){
            n /= 5;
            ans += n;
        }
        return ans;
    }
}