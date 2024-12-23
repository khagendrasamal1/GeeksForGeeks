//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    String maxOdd(String s) {
        // code here
        int n = s.length()-1;
        
        while(n >= 0){
            int digit = s.charAt(n) - '0';
            
            if(digit % 2 != 0){
                return s.substring(0, n+1);
            }
            n--;
        }
        return "";
    }
}