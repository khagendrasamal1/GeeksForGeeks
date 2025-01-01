//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    
System.out.println("~");
}
		
	}
}

// } Driver Code Ends




class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        long sum = 0;
        long currSum = 0;
        
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                currSum = currSum * 10 + (ch-'0');
            }else{
                sum += currSum;
                currSum = 0;
            }
        }
        sum += currSum;
        
        return sum;
    }
}