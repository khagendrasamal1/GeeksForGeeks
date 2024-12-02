//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().trappingWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int trappingWater(int arr[]) {
        // code here
        int i = 0;
        int j = arr.length-1;
        
        int maxLeft = 0;
        int maxRight = 0;
        int water = 0;
        
        while(i < j){
            if(arr[i] <= arr[j]){
                maxLeft = Math.max(maxLeft, arr[i]);
                water += maxLeft - arr[i];
                i++;
            }else{
                maxRight = Math.max(maxRight, arr[j]);
                water += maxRight - arr[j];
                j--;
            }
        }
        return water;
    }
}
