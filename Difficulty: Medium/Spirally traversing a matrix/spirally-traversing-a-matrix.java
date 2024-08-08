//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int topRow = 0, leftCol = 0, bottomRow = rows - 1, rightCol = cols - 1;
        
        while (topRow <= bottomRow && leftCol <= rightCol) {
            for (int col = leftCol; col <= rightCol; col++) {
                ans.add(matrix[topRow][col]);
            }
            topRow++;

            for (int row = topRow; row <= bottomRow; row++) {
                ans.add(matrix[row][rightCol]);
            }
            rightCol--;
    
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    ans.add(matrix[bottomRow][col]);
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    ans.add(matrix[row][leftCol]);
                }
                leftCol++;
            }
        }
        
        return ans;
    }
}
