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
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            System.out.println(ob.countPrimes(L, R));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countPrimes(int L, int R) {
        // code here
        boolean[] prime = new boolean[R + 1];
        
        for (int i = 2; i <= R; i++) {
            prime[i] = true;
        }
        
        for (int i = 2; i * i <= R; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= R; j += i) {
                    prime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = Math.max(L, 2); i <= R; i++) {
            if (prime[i]) {
                count++;
            }
        }
        return count;
    }
};