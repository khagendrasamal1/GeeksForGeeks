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

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.countBits(n);

            IntArray.print(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static ArrayList<Integer> countBits(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        
        for(int i=1; i<=n; i++){
            String binary = Integer.toBinaryString(i);
            int ones = helper(binary);
            list.add(ones);
        }
        return list;
    }
    
    public static int helper(String num){
        int cnt = 0;
        
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '1'){
                cnt++;
            }
        }
        return cnt;
    }
}
