class Solution {

    public class Triplet {
        int row;
        int col;
        int time;

        Triplet(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<Triplet> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 2) {
                    q.add(new Triplet(i, j, 0));
                }
            }
        }

        int maxtime = 0;

        while (!q.isEmpty()) {

            Triplet front = q.remove();

            int row = front.row;
            int col = front.col;
            int time = front.time;

            maxtime = Math.max(maxtime, time);

            // UP
            if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                grid[row - 1][col] = 2;
                q.add(new Triplet(row - 1, col, time + 1));
            }

            // DOWN
            if (row + 1 < m && grid[row + 1][col] == 1) {
                grid[row + 1][col] = 2;
                q.add(new Triplet(row + 1, col, time + 1));
            }

            // LEFT
            if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                grid[row][col - 1] = 2;
                q.add(new Triplet(row, col - 1, time + 1));
            }

            // RIGHT
            if (col + 1 < n && grid[row][col + 1] == 1) {
                grid[row][col + 1] = 2;
                q.add(new Triplet(row, col + 1, time + 1));
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return maxtime;
    }
}