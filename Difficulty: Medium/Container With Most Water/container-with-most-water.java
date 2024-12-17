//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxArea(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {

    public int maxArea(int arr[]) {
        // Code Here
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int maxArea = 0;  
        
        while (i < j) {
            int area = Math.min(arr[i], arr[j]) * (j - i);
            maxArea = Math.max(area, maxArea);

            // Move the pointer with the shorter height
            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}