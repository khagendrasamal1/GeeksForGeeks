//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        int i = 0;
        int j = S.length()-1;
        
        String s1 = S.toLowerCase();
        
        while(i < j){
            if(s1.charAt(i) != s1.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
};