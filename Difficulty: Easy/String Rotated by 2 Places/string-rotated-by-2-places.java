//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        String s12 = sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            Solution obj = new Solution();

            boolean flag = obj.isRotated(s1, s2);

            if (flag == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        
        if (s1.length() < 2) {
            return false;
        }

        String clockwise = s1.substring(2) + s1.substring(0, 2);

        String antiClockwise = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);

        return s2.equals(clockwise) || s2.equals(antiClockwise);
    }
}