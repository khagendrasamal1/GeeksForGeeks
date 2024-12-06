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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int N) { 
         //code here
         Set<Integer> set = new HashSet<>();
         
         while(N != 1 && !set.contains(N)){
            set.add(N);
            int sum = 0;
            
            while(N != 0){
                int digit = N % 10;
                sum += digit * digit;
                N /= 10;
            }
            N = sum;
         }
         return N == 1 ? 1 : 0;
     }
}