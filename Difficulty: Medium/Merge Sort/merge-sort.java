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
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        
        int n = arr.length;
        
        if(n < 2)   return;
        
        int mid = l + (r-l) / 2;
        
        int leftArr[] = new int[mid];
        int rightArr[] = new int[n-mid];
        
        for(int i=0; i<mid; i++){
            leftArr[i] = arr[i];
        }
        
        for(int i=mid; i<n; i++){
            rightArr[i-mid] = arr[i];
        }
        
        mergeSort(leftArr, 0, mid);
        mergeSort(rightArr, mid, n-mid);
        
        merge(arr, leftArr, rightArr, mid, n-mid);
    }
    
    void merge(int arr[], int left[], int right[], int l, int r){
        int i=0;
        int j=0;
        int k=0;
        
        while(i<l && j<r){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        
        while(i<l){
            arr[k++] = left[i++];
        }
        
        while(j<r){
            arr[k++] = right[j++];
        }
    }
}
