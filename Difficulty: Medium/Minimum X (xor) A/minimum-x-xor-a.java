//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        
out.println("~");
}
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
        // code here
        int ans = 0;
        int bit = 31;
        int setBits = Integer.bitCount(b);
        
        while(setBits > 0 && bit >= 0){
            if((a & (1 << bit)) != 0){
                ans = ans | (1 << bit);
                setBits--;
            }
            bit--;
        }
        
        bit = 0;
        while(setBits > 0 && bit <= 32){
            if((a & (1 << bit)) == 0){
                ans = ans | (1 << bit);
                setBits--;
            }
            bit++;
        }
        return ans;
    }
}