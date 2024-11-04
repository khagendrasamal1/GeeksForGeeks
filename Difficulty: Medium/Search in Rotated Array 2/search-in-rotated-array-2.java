//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    public static boolean Search(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int low = 0;
        int high = n-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(arr[mid] == k)   return true;
            
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }
            
            if(arr[low] <= arr[mid]){
                if(arr[low] <= k && k <= arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid] <= k && k <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

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
            boolean res = obj.Search(arr, k);
            if (res)
                System.out.println("true");
            else
                System.out.println("false");

            // System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends