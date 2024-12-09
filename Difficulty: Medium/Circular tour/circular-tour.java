//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();

            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            line = read.readLine();
            tokens = line.split(" ");
            for (String token : tokens) {
                array2.add(Integer.parseInt(token));
            }

            // ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr1 = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr1[idx++] = i;

            int[] arr2 = new int[array2.size()];
            idx = 0;
            for (int i : array2) arr2[idx++] = i;

            int ans = new Solution().circularTour(arr1, arr2);

            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int circularTour(int[] a1, int[] a2) {
        // code here
        int position = 0;
        int sum = 0;
        int total = 0;
        
        for(int i=0; i<a1.length; i++){
            sum += a1[i] - a2[i];
            
            if(sum < 0){
                total += sum;
                sum = 0;
                position = i+1;
            }
        }
        total += sum;
        
        return total >= 0 ? position : -1;
    }
}
