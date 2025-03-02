//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // taking total number of elements
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
            int k = Integer.parseInt(br.readLine());
            ArrayList<Integer> res = new Solution().maxOfSubarrays(arr, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        // code here
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k-1){
                ans.add(arr[dq.peekFirst()]);
            }
        }
        return ans;
    }
}