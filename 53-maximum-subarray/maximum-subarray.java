class Solution {
    public int maxSubArray(int[] nums) {
      int i = 0;
      int n = nums.length;
      int bestans = nums[0];
      int ans = nums[0];
      for(i = 1; i<= n-1 ; i++){ // if i starts from 0 then it count nums[0]            2 times and the ans will be wrong
        int v1 = bestans + nums[i];
        int v2 = nums[i];
        bestans = Math.max(v1,v2);
        ans = Math.max(ans,bestans);
      } return ans;
    }
}