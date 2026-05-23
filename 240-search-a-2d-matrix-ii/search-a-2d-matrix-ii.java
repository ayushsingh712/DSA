class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int cols = n-1;
        while(cols >= 0 && row < m ){
            if(matrix[row][cols] == target) return true;
            else if (matrix[row][cols] < target) row++;
            else cols--;
        }
        return false;
    }
}