//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0) {
            String line = scanner.nextLine().trim();
            String[] parts = line.split("\\s+");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }

            Solution ob = new Solution();
            List<Integer> ans = ob.valueEqualToIndex(nums);
            if (ans.isEmpty()) {
                System.out.println("Not Found");
            } else {
                for (int x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        
System.out.println("~");
}
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) == i+1){
                ans.add(nums.get(i));
            }
        }
        return ans;
    }
}