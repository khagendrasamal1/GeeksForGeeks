//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        int requiredCount = B - A + 1;
        
        
        boolean[] present = new boolean[requiredCount];
        
        
        for (int i = 0; i < n; i++) {
            if (arr[i] >= A && arr[i] <= B) {
                present[arr[i] - A] = true; 
            }
        }

        for (int i = 0; i < requiredCount; i++) {
            if (!present[i]) {
                return false;
            }
        }

        return true; 
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            //            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n = Integer.parseInt(q[0]);
            int k = Integer.parseInt(q[1]);
            int y = Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            //            String line2 = br.readLine();
            //            String[] a2 = line2.trim().split("\\s+");
            //            long b[] = new long[n];
            //            for (int i = 0; i < m; i++) {
            //                b[i] = Long.parseLong(a2[i]);
            //            }
            Solution ob = new Solution();
            boolean ans = ob.check_elements(a, n, k, y);
            // System.out.println(ob.shuffleArray(a,n,k,y));
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends