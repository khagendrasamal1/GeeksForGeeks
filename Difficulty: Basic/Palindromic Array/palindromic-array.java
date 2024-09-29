//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.palinArray(arr) ? "true" : "false");
        }
    }
}
// } Driver Code Ends


/*Complete the Function below*/
class Solution {
    public static boolean palinArray(int[] arr) {
        // add code here.
        
        for(int num : arr){
            if(!isPalindrome(num)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(int num){
        int org = num;
        int rev = 0;
        
        while(num > 0){
            int digit = num % 10;
            rev = rev*10 + digit;
            num /= 10;
        }
        
        return org == rev;
    }
}