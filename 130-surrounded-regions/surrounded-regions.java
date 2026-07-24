class Solution {

    public void solve(char[][] board) {

        if (board == null || board.length == 0 || board[0].length == 0)
            return;

        int rows = board.length;
        int cols = board[0].length;

        // First Row
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O')
                dfs(board, 0, j);
        }

        // Last Row
        for (int j = 0; j < cols; j++) {
            if (board[rows - 1][j] == 'O')
                dfs(board, rows - 1, j);
        }

        // First Column
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O')
                dfs(board, i, 0);
        }

        // Last Column
        for (int i = 0; i < rows; i++) {
            if (board[i][cols - 1] == 'O')
                dfs(board, i, cols - 1);
        }

        // Convert surrounded O -> X and # -> O
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (board[i][j] == 'O')
                    board[i][j] = 'X';

                else if (board[i][j] == '#')
                    board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {

        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length ||
            board[i][j] != 'O')
            return;

        board[i][j] = '#';

        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}