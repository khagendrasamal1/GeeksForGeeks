//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        
out.println("~");
}
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        
        StringBuilder sb = new StringBuilder();
        int n = 0;
        
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                n = n * 10 + c - '0';
            }else if(c == '['){
                str.push(sb);
                sb = new StringBuilder();
                num.push(n);
                n = 0;
            }else if(c == ']'){
                StringBuilder temp = sb;
                sb = str.pop();
                int cnt = num.pop();
                
                while(cnt --> 0){
                    sb.append(temp);
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}