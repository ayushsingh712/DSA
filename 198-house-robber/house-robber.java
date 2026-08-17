class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [][] dp = new int[n][2];
        for(int i = 0;i<n;i++) Arrays.fill(dp[i],-1);
        return fun(nums,0,n,1,dp);
    }
    public int fun(int [] nums , int i , int n,int free,int [][] dp){
        if(i == n) return 0;
        if(dp[i][free] != -1){
            return dp[i][free];
        }        
        if(free == 0) return dp[i][free] = fun(nums,i+1,n,1,dp);
        int c1 = nums[i] + fun(nums,i+1,n,0,dp);
        int c2 = fun(nums,i+1,n,1,dp);
        int amt = Math.max(c1,c2);
        return dp[i][free] = amt;
    }
}