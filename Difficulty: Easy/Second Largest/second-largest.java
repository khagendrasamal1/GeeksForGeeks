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
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int print2largest(int[] arr) {
        // Code Here
        int largest = arr[0];
        int sec_largest = -1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                sec_largest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > sec_largest){
                sec_largest = arr[i];
            }
        }
        return sec_largest;
    }
}