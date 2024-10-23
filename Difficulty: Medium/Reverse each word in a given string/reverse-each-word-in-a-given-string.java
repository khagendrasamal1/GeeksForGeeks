//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String S)
    {
        // your code here
        char arr[] = S.toCharArray();
        
        int n = arr.length;
        
        int i = 0;
        
        for(int j=0; j<=n; j++){
            if(j == n || arr[j] == '.'){
                reverse(arr, i, j-1);
                i = j+1;
            }
        }
        return new String(arr);
    }
    
    void reverse(char arr[], int i, int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
    }
}