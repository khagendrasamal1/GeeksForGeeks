//{ Driver Code Starts
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
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        // code here
        if(N <= 1)  return 0;
        if(N <= 3)  return 1;
        
        return primeHelper(N, 2);
    }
    
    static int primeHelper(int n, int i){
        if(i*i > n) return 1;
        
        if(n % i == 0)  return 0;
        
        return primeHelper(n, i+1);
    }
}