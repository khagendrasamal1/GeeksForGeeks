//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();
            System.out.println(obj.transitionPoint(arr));
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int n = arr.length;
        
        if(arr[0] != 0) return 0;
        if(arr[n-1] != 1) return -1;
        
        int i=0, j=n-1, point=-1;
        
        while(i <= j){
            int mid = i + (j-i)/2;
            
            if(arr[mid] == 1){
                point = mid;
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return point;
    }
}