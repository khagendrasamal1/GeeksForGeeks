//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int first = firstOccur(arr, x);
        int last = lastOccur(arr, x);
        
        ans.add(first);
        ans.add(last);
        
        return ans;
    }
    
    public static int firstOccur(int arr[], int x){
        int left = 0, right = arr.length-1, ans = -1;
        
        while(left <= right){
            int mid = left + (right-left)/2;
            
            if(arr[mid] == x){
                ans = mid;
                right = mid-1;
            }else if(arr[mid] < x){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    
    public static int lastOccur(int arr[], int x){
        int low = 0, high = arr.length-1, ans = -1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(arr[mid] == x){
                ans = mid;
                low = mid+1;
            }else if(arr[mid] < x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            int x = Integer.parseInt(br.readLine());
            GFG ob = new GFG();
            ArrayList<Integer> ans = ob.find(arr, x);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends