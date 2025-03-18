//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    public int longestSubarray(int arr[]) {
        // write code here
        int max = 0, curr = 0;
        
        for(int num : arr){
            if(num >= 0){
                curr++;
                max = Math.max(max, curr);
            }else{
                curr = 0;
            }
        }
        return max;
    }
}


//{ Driver Code Starts.

// Driver class
public class Array {
    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            for (int i = 0; i < array.size(); i++) {
                arr[i] = array.get(i);
            }

            Solution obj = new Solution();
            int res = obj.longestSubarray(arr); // Fixed method name
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends