//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Static method to find the longest palindromic substring
    static String longestPalindrome(String s) {
        // code here
        int n = s.length();
        
        int start = 0, end = 0, max = 0;
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPalindrome(s, i, j) == true){
                    if(j-i+1 > max){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
    
    static boolean isPalindrome(String s, int i, int j){
        while(i < j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            
            if(ch1 != ch2)  return false;
            i++;
            j--;
        }
        return true;
    }
}