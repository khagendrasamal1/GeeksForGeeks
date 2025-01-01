//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]); // Parse the input array
            }

            Solution sol = new Solution();
            if (sol.findTriplets(arr))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}

// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        // code here.
        int n = arr.length;
        
        Arrays.sort(arr);
        
        for(int i=0; i<n-2; i++){
            int left = i+1, right = n-1;
            
            while(left < right){
                int sum = arr[left] + arr[right] + arr[i];
                
                if(sum == 0){
                    return true;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
}