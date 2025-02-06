//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            Node root = null;

            // Read inorder array
            String[] inorderStr = (br.readLine()).trim().split(" ");
            int inorder[] = new int[inorderStr.length];
            for (int i = 0; i < inorderStr.length; i++) {
                inorder[i] = Integer.parseInt(inorderStr[i]);
            }

            // Read preorder array
            String[] preorderStr = (br.readLine()).trim().split(" ");
            int preorder[] = new int[preorderStr.length];
            for (int i = 0; i < preorderStr.length; i++) {
                preorder[i] = Integer.parseInt(preorderStr[i]);
            }

            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder);
            postOrder(root);
            System.out.println();
        }
    }

    // Function to print postorder traversal of the tree
    public static void postOrder(Node root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}

// } Driver Code Ends


/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        int n = inorder.length;
        
        Map<Integer, Integer> inorderIndex = new HashMap<>();
        
        for(int i=0; i<n; i++){
            inorderIndex.put(inorder[i], i);
        }
        
        return splitTree(preorder, inorderIndex, 0, 0, n-1);
    }
    
    static Node splitTree(int pre[], Map<Integer, Integer> map, int rootInd, int left, int right){
        Node root = new Node(pre[rootInd]);
        
        int mid = map.get(pre[rootInd]);
        
        if(mid > left){
            root.left = splitTree(pre, map, rootInd+1, left, mid-1);
        }
        
        if(mid < right){
            root.right = splitTree(pre, map, rootInd+mid-left+1, mid+1, right);
        }
        return root;
    }
}
