//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            // Read first array from the first line of input
            String line1 = br.readLine();
            String[] tokens1 = line1.split(" ");
            int[] arr1 = new int[tokens1.length];
            for (int i = 0; i < tokens1.length; i++) {
                arr1[i] = Integer.parseInt(tokens1[i]);
            }

            // Read second array from the next line of input
            String line2 = br.readLine();
            String[] tokens2 = line2.split(" ");
            int[] arr2 = new int[tokens2.length];
            for (int i = 0; i < tokens2.length; i++) {
                arr2[i] = Integer.parseInt(tokens2[i]);
            }

            // Create Solution object and call the function with arr1 and arr2
            Solution ob = new Solution();
            int result = ob.findExtra(arr1, arr2);

            // Print the result
            System.out.println(result);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int i=0, j=b.length-1, extra=a.length-1;
        
        while(i <= j){
            int mid = i + (j-i)/2;
            
            if(a[mid] != b[mid]){
                extra = mid;
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return extra;
    }
}