// Time Complexity : O(n*W)
// Space Complexity : O(n*W)
// Did this code successfully run on Leetcode : yes	
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


// "static void main" must be defined in a public class.
public class Main {
    public static int knapSack(int W, int wt[], int val[], int n){
        int dp [][] = new int [n+1][W+1];
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){
                if(i==0 || j == 0) dp[i][j] = 0;
                else if(wt[i-1] <= j) dp [i][j] = Math.max(val[i-1] + dp[i-1][j - wt[i - 1]], dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 }; 
		int wt[] = new int[] { 10, 20, 30 }; 
		int W = 5; 
		int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}