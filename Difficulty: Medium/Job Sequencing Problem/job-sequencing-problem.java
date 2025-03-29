//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = deadline.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        Job jobs[] = new Job[n];
        
        for(int i=0; i<n; i++){
            jobs[i] = new Job(deadline[i], profit[i]);
        }
        
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        
        int maxDeadline = 0;
        
        for(int d : deadline){
            maxDeadline = Math.max(d, maxDeadline);
        }
        
        boolean occ[] = new boolean[maxDeadline + 1];
        
        int maxProfit = 0, cnt = 0;
        
        for(Job job : jobs){
            for(int j = job.deadline; j>0; j--){
                if(!occ[j]){
                    occ[j] = true;
                    maxProfit += job.profit;
                    cnt++;
                    break;
                }
            }
        }
        
        list.add(cnt);
        list.add(maxProfit);
        
        return list;
    }
    
    class Job{
        int deadline, profit;
        
        Job(int d, int p){
            this.deadline = d;
            this.profit = p;
        }
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());

        while (t-- > 0) {
            String[] deadlineInput = sc.nextLine().trim().split("\\s+");
            int[] deadline =
                Arrays.stream(deadlineInput).mapToInt(Integer::parseInt).toArray();

            String[] profitInput = sc.nextLine().trim().split("\\s+");
            int[] profit =
                Arrays.stream(profitInput).mapToInt(Integer::parseInt).toArray();
            Solution obj = new Solution();
            ArrayList<Integer> result = obj.jobSequencing(deadline, profit);
            System.out.println(result.get(0) + " " + result.get(1));
            System.out.println("~");
        }

        sc.close();
    }
}
// } Driver Code Ends