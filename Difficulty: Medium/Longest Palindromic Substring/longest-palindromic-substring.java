//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestPalindrome(String S){
        // code here
        if(S.length() <= 1) return S;
        
        String LPS = S.substring(0, 1);
        
        for(int i=1; i<S.length(); i++){
            int low=i;
            int high=i;
            
            while(S.charAt(low) == S.charAt(high)){
                low--;
                high++;
                
                if(low == -1 || high == S.length()) break;
            }
            
            String palindrome = S.substring(low+1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }
            
            low = i-1;
            high = i;
            
            while(S.charAt(low) == S.charAt(high)){
                low--;
                high++;
                
                if(low == -1 || high == S.length()) break;
            }
            
            palindrome = S.substring(low+1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }
        }
        return LPS;
    }
}