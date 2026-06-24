class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap <String,Integer> map = new HashMap<>();
        int n = words.length;
        for(int i = 0;i<n;i++){
            map.put(words[i], map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
        (a,b) -> {
            if(map.get(a).equals(map.get(b))){
            return b.compareTo(a);
            }
            return map.get(a) - map.get(b);
            }
        );
        for(String word : map.keySet()){
            pq.offer(word);
            if(pq.size()>k) pq.poll();
        }

        List<String> ans = new ArrayList<>();
        while(!pq.isEmpty()){
        ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}