//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.kThSmallestFactor(N, K));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int kThSmallestFactor(int n, int k) {
        // code here
        int cnt = 0;
        
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                cnt++;
            }
            if(cnt == k) return i;
        }
        return -1;
    }
};