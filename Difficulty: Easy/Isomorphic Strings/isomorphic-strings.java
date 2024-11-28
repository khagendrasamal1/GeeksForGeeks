//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
        // Your code here
        if(s1.length() != s2.length()){
            return false;
        }
        
        int n = s1.length();
        
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Boolean> m2 = new HashMap<>();
        
        for(int i=0; i<n; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(m1.containsKey(ch1) == true){
                if(m1.get(ch1) != ch2){
                    return false;
                }
            }else{
                if(m2.containsKey(ch2) == true){
                    return false;
                }else{
                    m1.put(ch1, ch2);
                    m2.put(ch2, true);
                }
            }
        }
        return true;
    }
}