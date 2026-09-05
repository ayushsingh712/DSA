class Solution {

    public boolean isCycle(int V, int[][] edges) {

        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!vis[i]) {
                if (dfs(i, -1, vis, edges)) {
                    return true;
                }
            }
        }

        return false;
    }
    public boolean dfs(int node, int par, boolean[] vis, int[][] edges) {
        vis[node] = true;
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            int neigh = -1;

            if (u == node) {
                neigh = v;
            }
            else if (v == node) {
                neigh = u;
            }

            // Agar connected neighbour mila
            if (neigh != -1) {

                if (!vis[neigh]) {

                    if (dfs(neigh, node, vis, edges)) {
                        return true;
                    }

                }
                else if (neigh != par) {
                    return true;
                }
            }
        }

        return false;
    }
}