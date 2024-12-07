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
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        int n = arr.length;
        return mergeSort(arr, n);
    }

    static int mergeSort(int arr[], int n) {
        if (n < 2) {
            return 0;
        }

        int mid = n / 2;

        int leftArr[] = new int[mid];
        int rightArr[] = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            rightArr[i - mid] = arr[i];
        }

        int leftInversions = mergeSort(leftArr, mid);
        int rightInversions = mergeSort(rightArr, n - mid);

        int crossInversions = merge(arr, leftArr, rightArr, mid, n - mid);

        return leftInversions + rightInversions + crossInversions;
    }

    static int merge(int arr[], int left[], int right[], int l, int r) {
        int i = 0, j = 0, k = 0, cnt = 0;

        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                cnt += (l - i); 
            }
        }

        while (i < l) {
            arr[k++] = left[i++];
        }

        while (j < r) {
            arr[k++] = right[j++];
        }

        return cnt;
    }
}
