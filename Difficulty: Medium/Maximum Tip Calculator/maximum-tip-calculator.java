//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int x;
            x = Integer.parseInt(br.readLine());

            int y;
            y = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            int[] brr = IntArray.input(br, n);

            Solution obj = new Solution();
            long res = obj.maxTip(n, x, y, arr, brr);

            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends



class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
        int mat[][] = new int[n][3];
        
        for(int i=0; i<n; i++){
            mat[i][0] = arr[i];
            mat[i][1] = brr[i];
            mat[i][2] = Math.abs(arr[i] - brr[i]);
        }
        
        Arrays.sort(mat, (a, b) -> Integer.compare(b[2], a[2]));
        
        long max = 0;
        
        int cntA = 0, cntB = 0;
        
        for(int i=0; i<n; i++){
            int tipA = mat[i][0], tipB = mat[i][1];
            
            if((tipA >= tipB && cntA < x) || cntB >= y){
                max += tipA;
                cntA++;
            }else{
                max += tipB;
                cntB++;
            }
        }
        return max;
    }
}
