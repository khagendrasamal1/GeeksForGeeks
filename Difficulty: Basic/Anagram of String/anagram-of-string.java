//{ Driver Code Starts
//saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
        int freqA[] = new int[26];
        int freqB[] = new int[26];
        
        for(char c : s.toCharArray()){
            freqA[c-'a']++;
        }
        
        for(char c : s1.toCharArray()){
            freqB[c-'a']++;
        }
        
        int cnt = 0;
        for(int i=0; i<26; i++){
            cnt += Math.abs(freqA[i] - freqB[i]);
        }
        return cnt;
        }
}