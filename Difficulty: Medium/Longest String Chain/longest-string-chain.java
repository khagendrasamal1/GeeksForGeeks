//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] words = sc.nextLine().trim().split(" ");
            Solution obj = new Solution();
            int res = obj.longestStringChain(words);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int longestStringChain(String words[]) {
        // code here
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        
        int ans = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String word : words){
            map.put(word, 1);
            
            for(int i=0; i<word.length(); i++){
                StringBuilder sb = new StringBuilder(word);
                String next = sb.deleteCharAt(i).toString();
                
                if(map.containsKey(next)){
                    map.put(word, Math.max(map.get(word), map.get(next)+1));
                }
            }
            ans = Math.max(ans, map.get(word));
        }
        return ans;
    }
}