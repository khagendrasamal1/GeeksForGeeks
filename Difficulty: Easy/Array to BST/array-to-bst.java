//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Main {
    public static boolean isValidBSTUtil(Node node, long lower, long upper) {
        if (node == null) return true;
        if (node.data <= lower || node.data >= upper) return false;
        return isValidBSTUtil(node.left, lower, node.data) &&
            isValidBSTUtil(node.right, node.data, upper);
    }

    public static boolean isValidBST(Node root) {
        return isValidBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static int height(Node root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 ||
            Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static boolean isBalanced(Node root) { return height(root) != -1; }

    public static void inorder(Node root, List<Integer> v) {
        if (root == null) return;
        inorder(root.left, v);
        v.add(root.data);
        inorder(root.right, v);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String input = br.readLine().trim();
            String[] inputArr = input.split(" ");
            int[] arr = new int[inputArr.length];
            for (int i = 0; i < inputArr.length; i++) {
                arr[i] = Integer.parseInt(inputArr[i]);
            }

            Solution obj = new Solution();
            Node root = obj.sortedArrayToBST(arr);
            List<Integer> v = new ArrayList<>();
            inorder(root, v);

            int[] vrr = v.stream().mapToInt(Integer::intValue).toArray();
            boolean isBST = isValidBST(root);
            if (!isBST || !Arrays.equals(vrr, arr)) {
                System.out.println("false");
                continue;
            }

            boolean balanced = isBalanced(root);
            if (balanced) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        int n = nums.length;
        
        if(n == 0)  return null;
        
        return getBST(nums, 0, n-1);
    }
    
    static Node getBST(int nums[], int start, int end){
        if(start > end) return null;
        
        int mid = start + (end - start) / 2;
        
        Node root = new Node(nums[mid]);
        
        root.left = getBST(nums, start, mid-1);
        root.right = getBST(nums, mid+1, end);
        
        return root;
    }
}