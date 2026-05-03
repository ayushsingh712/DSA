class Solution {
    public int maxProduct(int[] nums) {
        int minbest = nums[0];
        int maxbest = nums[0];
        int res = nums[0];
        int n = nums.length;
        for(int i = 1;i< n ; i++){
            int v1 = nums[i];
            int v2 = minbest * nums[i];
            int v3 = maxbest * nums[i];
            minbest = Math.min(v1 , Math.min(v2,v3));
            maxbest = Math.max(v1,Math.max(v2,v3));
            res = Math.max(res,Math.max(minbest,maxbest));
        }
        return res;
    }
}