//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int left = 0, max = 0;
        int[] lastSeen = new int[128];
        
        for(int i=0; i<128; i++){
            lastSeen[i] = -1;
        }
        
        for(int right=0; right<s.length(); right++){
            char curr = s.charAt(right);
            
            if(lastSeen[curr] >= left){
                left = lastSeen[curr]+1;
            }
            
            lastSeen[curr] = right;
            
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}