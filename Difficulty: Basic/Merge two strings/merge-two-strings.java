//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        int n1 = S1.length();
        int n2 = S2.length();
        
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        
        while(i<n1 || i<n2){
            if(i<n1){
                sb.append(S1.charAt(i));
            }if(i<n2){
                sb.append(S2.charAt(i));
            }
        i++;
        }
        return sb.toString();
    }
} 