//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String digits = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countWays(digits);
            out.println(ans);

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int countWays(String digits) {
        // code here
        int n = digits.length();
        if (digits == null || n == 0) return 0;
        if (digits.charAt(0) == '0') return 0; 

        int dp1 = 1;  
        int dp2 = 1;  

        for (int i = 1; i < n; i++) {
            int dp = 0;

            int lenOne = digits.charAt(i) - '0';
            if (lenOne >= 1 && lenOne <= 9) {
                dp += dp1;
            }

            // Consider two-digit decoding
            int lenTwo = Integer.parseInt(digits.substring(i - 1, i + 1));
            if (lenTwo >= 10 && lenTwo <= 26) {
                dp += dp2;
            }

            dp2 = dp1;
            dp1 = dp;
        }
        return dp1;
    }
}