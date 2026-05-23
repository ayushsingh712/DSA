class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = m-1;
        int cols = 0;
        while(row >= 0 && cols < n){
            if(matrix[row][cols] == target) return true;
            else if (matrix[row][cols] < target) cols++;
            else row--;
        }
        return false;
    }
}