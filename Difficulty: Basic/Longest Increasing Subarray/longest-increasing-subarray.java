//{ Driver Code Starts
// Initial Template for Java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// } Driver Code Ends
// User function Template for Java
class Solution {
    public int lenOfLongIncSubArr(List<Integer> arr) {
        // Your Code goes here.
        int n = arr.size();
        
        int incr = 1;
        int longest = 1;
        
        for(int i=1; i<n; i++){
            if(arr.get(i) > arr.get(i-1)){
                incr++;
            }else{
                incr = 1;
            }
            longest = Math.max(longest, incr);
        }
        return longest;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Solution ob = new Solution();

        while (t-- > 0) {
            String s = scanner.nextLine();
            Scanner lineScanner = new Scanner(s);
            List<Integer> arr = new ArrayList<>();

            while (lineScanner.hasNextInt()) {
                arr.add(lineScanner.nextInt());
            }

            int ans = ob.lenOfLongIncSubArr(arr);
            System.out.println(ans);
            System.out.println("~");
        }

        scanner.close();
    }
}
// } Driver Code Ends