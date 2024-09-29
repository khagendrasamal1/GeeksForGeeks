//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
    
        for(int value : arr) {
            if(value > first) {
                second = first;
                first = value;
    
            } else if(value > second && value != first) {
                second = value;
            }
        }
        
        if (second == Integer.MIN_VALUE) {
            return -1;  
            
        }
        
        return second;
    }
}