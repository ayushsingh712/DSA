class Solution {
    public boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q')
                return false;
        }
        // column
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        // upper-right
        int i = row;
        int j = col;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        // lower-right
        i = row;
        j = col;
        while (i < n && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j++;
        }
        // lower-left
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j--;
        }
        // upper-left
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        return true;
    }
    public int nqueens(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            return 1;
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                count += nqueens(board, row + 1);
                board[row][j] = '.';
            }
        }
        return count;
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        return nqueens(board, 0);
    }
}