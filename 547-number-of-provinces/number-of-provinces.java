class Solution {
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        boolean [] vis = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(!vis[i]){
                bfs(i, adj, vis);
                count++;
            }
        }
        return count;
    }
    public void bfs(int i ,int[][] adj, boolean [] vis){
        int n = adj.length;
        vis[i] = true;
        Queue <Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int f = q.remove();
            for(int j = 0 ; j<n;j++){
                if(adj[f][j] == 1 && vis[j]== false){
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }
}