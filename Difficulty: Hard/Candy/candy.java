//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minCandy(int N, int ratings[]) {
        // code here
        if(N <= 1)  return N;
        
        int up = 0;
        int down = 0;
        int slope = 0;
        int candies = 0;
        
        for(int i=1; i<N; i++){
            int curr = ratings[i] > ratings[i-1] ? 1 :
                        (ratings[i] < ratings[i-1] ? -1 : 0);
            
            if((slope < 0 && curr >= 0) || (slope > 0 && curr == 0)){
                candies += sum(up) + sum(down) + Math.max(up, down);
                up = 0;
                down = 0;
            }
            if(curr < 0)    down++;
            else if(curr > 0)   up++;
            else    candies++;
            
            slope = curr;
        }
        candies += sum(up) + sum(down) + Math.max(up, down) + 1;
        
        return candies;
    }
    public static int sum(int n){
        return (n*(n+1))/2;
    }
}
