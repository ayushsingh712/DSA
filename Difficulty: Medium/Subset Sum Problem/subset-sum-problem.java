class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;

        Boolean[][] dp = new Boolean[n][sum + 1];

        return fun(arr, 0, n, sum, dp);
    }

    static boolean fun(int arr[], int i, int n, int sum, Boolean[][] dp) {

        if (i == n) {
            return sum == 0;
        }

        if (dp[i][sum] != null)
            return dp[i][sum];

        if (arr[i] > sum)
            return dp[i][sum] = fun(arr, i + 1, n, sum, dp);

        boolean c1 = fun(arr, i + 1, n, sum - arr[i], dp);
        boolean c2 = fun(arr, i + 1, n, sum, dp);

        return dp[i][sum] = c1 || c2;
    }
}