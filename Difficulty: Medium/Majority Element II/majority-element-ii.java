//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        int cnt1 = 0, cnt2 = 0; 
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (cnt1 == 0 && ele2 != num) {
                ele1 = num;
                cnt1++;
            } else if (cnt2 == 0 && ele1 != num) {
                ele2 = num;
                cnt2++;
            } else if (num == ele1) {
                cnt1++;
            } else if (num == ele2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (num == ele1) cnt1++;
            if (num == ele2) cnt2++;
        }

        int min = n / 3;
        if (cnt1 > min) ans.add(ele1);
        if (cnt2 > min && ele1 != ele2) ans.add(ele2);

        Collections.sort(ans);
        return ans;
    }
}
