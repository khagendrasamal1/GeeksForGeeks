//{ Driver Code Starts
import java.util.*;
import java.io.*;


// } Driver Code Ends

class Solution 
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        for(int i=0; i<size; i++){
            if(arr[i]<=0 || arr[i]>=size+1){
                arr[i] = size+1;
            }
        }
        
        for(int i=0; i<size; i++){
            int ele = Math.abs(arr[i]);
            if(ele == size+1){
                continue;
            }
            int seat = ele-1;
            if(arr[seat]>0){
                arr[seat] = -arr[seat];
            }
        }
        
        for(int i=0; i<size;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return size+1;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) throws IOException
    {

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		
        //taking testcases
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    
		    //input number n
			int n=Integer.parseInt(in.readLine().trim());
			int[] arr=new int[n];
			String s[]=in.readLine().trim().split(" ");
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(s[i]);
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			out.println(missing);
		}
		out.close();
    }
}


// } Driver Code Ends