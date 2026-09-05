class Solution {

    public boolean isCyclic(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
        }

        boolean[] vis = new boolean[V];
        boolean[] path = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(dfs(i, adj, vis, path)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,
                       boolean[] vis, boolean[] path){

        vis[node] = true;
        path[node] = true;

        for(int neigh : adj.get(node)){

            if(path[neigh]){
                return true;
            }

            if(!vis[neigh]){
                if(dfs(neigh, adj, vis, path)){
                    return true;
                }
            }
        }

        path[node] = false;

        return false;
    }
}