class Solution {
    public class triplet implements Comparable<triplet>{
        int node;
        int cost;
        int steps;
        triplet(int node,int cost,int steps){
            this.node = node;
            this.cost = cost;
            this.steps = steps;
        }
        public int compareTo(triplet t){
            if(this.cost == t.cost) return Integer.compare(this.node,t.node);
            return Integer.compare(this.steps,t.steps);
        }
    }
    public class Pair{
        int node;
        int cost;
        Pair(int node,int cost){
            this.node = node;
            this.cost = cost;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++) adj.add(new ArrayList<>());
        for(int i = 0;i<flights.length;i++){
            int from = flights[i][0],to = flights[i][1],price = flights[i][2];
            adj.get(from).add(new Pair(to,price));
        }
        int [] ans = new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;
        Queue<triplet> q = new LinkedList<>();
        q.add(new triplet(src,0,0));
        while(q.size() > 0){
            triplet top = q.remove();
            int node = top.node , cost = top.cost , steps = top.steps;
            if(steps == k+1) continue;
            for(Pair p : adj.get(node)){
                int totalcost = cost + p.cost;
                if(totalcost < ans[p.node]){
                    ans[p.node] = totalcost;
                    q.add(new triplet(p.node,totalcost,steps+1));
                }
            }
        }
        if(ans[dst] == Integer.MAX_VALUE) return -1;
        return ans[dst];
    }
}