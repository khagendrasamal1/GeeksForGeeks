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
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        int maxLen = 0;
        int i=0, j=0;
        int n = S.length();
        
        Map<Character, Integer> map = new HashMap<>(); 
        
        if(n == 0){
            return 0;
        }
        
        while(j < n){
            if(map.containsKey(S.charAt(j)))
                i = Math.max(map.get(S.charAt(j))+1, i);
            
            map.put(S.charAt(j), j);
            
            maxLen = Math.max(maxLen, (j-i+1));
            j++;
        }
        return maxLen;
    }
}