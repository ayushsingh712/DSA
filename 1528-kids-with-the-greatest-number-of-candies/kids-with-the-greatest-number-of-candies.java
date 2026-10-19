class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int n = candies.length;
        int m = 0;
        for(int i = 0;i < n;i++){
            m = Math.max(m,candies[i]);
        }
        for(int i = 0;i<n;i++){
            if(candies[i] + extraCandies >= m){
                res.add(true);
            } else res.add(false);
        }
        return res;
    }
}