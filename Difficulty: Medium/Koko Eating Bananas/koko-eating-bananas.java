//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

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
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.kokoEat(arr, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int kokoEat(int[] arr, int k) {
        // code here
        int min = 1;
        int max = 0;
        
        for(int a : arr){
            max = Math.max(max, a);
        }
        
        while(min < max){
            int mid = min + (max-min)/2;
            
            if(canEat(arr, k, mid)){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return min;
    }
    
    public static boolean canEat(int arr[], int k, int speed){
        int hours = 0;
        
        for(int a : arr){
            hours += (int) Math.ceil((double)a/speed);
        }
        return hours <= k;
    }
}
