//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str = read.readLine();
            System.out.println(new Reverse().reverseString(str));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Reverse {
    // Complete the function
    // str: input string
    public static String reverseString(String s) {
        // Reverse the string str
        StringBuilder sb = new StringBuilder(); 
        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            sb.append(s.charAt(i)); 
        }

        return sb.toString();
    }
}