import java.util.Arrays;
class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int n = wt.length;
        int [][] dp = new int[n+1][W+1];
        for(int [] row : dp){
            Arrays.fill(row,-1);
        }
        return kp(W,val,wt,n,dp);
    }
    public int kp(int W , int val[],int wt[],int n , int [][] dp){
        if(n==0 || W == 0) return 0;
        if(dp[n][W] != -1) return dp[n][W];
        
        if(wt[n-1] <= W){
            return dp[n][W] = Math.max(val[n-1] + kp(W-wt[n-1],val,wt,n-1,dp),kp(W,val,wt,n-1,dp));
        }
        else {
            return dp[n][W] = kp(W,val,wt,n-1,dp);
        }
    }
}