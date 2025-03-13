//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int low = 0, mid = 0, high = arr.length-1;
        
        while(mid <= high){
            if(arr[mid] < a){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid] > b){
                swap(arr,mid, high);
                high--;
            }else{
                mid++;
            }
        }
    }
    
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            obj.threeWayPartition(arr, a, b);
            int ia = 0;
            int ib = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= a) {
                    ia = i;
                    break;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > b) {
                    ib = i;
                    break;
                }
            }

            int f = 0;

            for (int i = 0; i < ia; i++) {
                if (arr[i] >= a) {
                    f = 1;
                    break;
                }
            }

            for (int i = ia; i < ib; i++) {
                if (arr[i] > b || arr[i] < a) {
                    f = 1;
                    break;
                }
            }

            for (int i = ib; i < arr.length; i++) {
                if (arr[i] < b) {
                    f = 1;
                    break;
                }
            }

            if (f == 1) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends