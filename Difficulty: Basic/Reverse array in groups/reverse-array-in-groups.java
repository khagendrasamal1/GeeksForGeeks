//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();
        
        for(int i=0; i<n; i += k){
            int left = i;
            int right = Math.min(i+k-1, n-1);
            
            while(left < right){
                long temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }
}

//{ Driver Code Starts.

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            ArrayList<Long> arr = new ArrayList<>();
            Scanner ss = new Scanner(input);
            while (ss.hasNextLong()) {
                arr.add(ss.nextLong());
            }
            Solution ob = new Solution();
            ob.reverseInGroups(arr, k);
            for (long num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends