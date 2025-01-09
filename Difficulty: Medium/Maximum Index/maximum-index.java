//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0) {
            String line = scanner.nextLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxIndexDiff(nums));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to find the maximum index difference.
    int maxIndexDiff(int[] arr) {
        // Your code here
        int n = arr.length;

        int[] rightMax = new int[n];
        
        rightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
        }
        
        int maxDiff = Integer.MIN_VALUE; 
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (rightMax[j] >= arr[i]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }
}