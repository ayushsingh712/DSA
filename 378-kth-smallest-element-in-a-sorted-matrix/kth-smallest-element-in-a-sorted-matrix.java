class Solution {
    public int fun(int[][] matrix,int m, int n, int mid){
        int row = m-1;
        int cols = 0;
        int count = 0;
        while(row >=0 && cols<n){
            if(matrix[row][cols]<=mid){
                count = count + row + 1;
                cols++;
            } else {
                row--;
            }
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = -1;
        int low = matrix[0][0];
        int high = matrix[m-1][n-1];
        while(low <= high){
            int mid = low + (high - low)/2;
            int ans = fun(matrix,m,n,mid);
            if(ans < k){
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
}