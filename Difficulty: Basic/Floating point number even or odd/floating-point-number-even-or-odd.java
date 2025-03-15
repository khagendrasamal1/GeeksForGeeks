//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String s = read.readLine().trim(); 
            Solution obj = new Solution();
            if(obj.isEven(s,n))
                System.out.println("EVEN");
            else
                System.out.println("ODD");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean isEven(String s,int n) 
    { 
        // code here
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch >= '1' && ch <= '9'){
                return (ch - '0') % 2 == 0;
            }
        }
        return true;
    }
} 