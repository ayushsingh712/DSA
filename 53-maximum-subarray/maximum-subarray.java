class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int msum = nums[0];
        int sum = nums[0];
        for(int i = 1;i<n;i++){
            if(sum >= 0){
                sum = sum + nums[i];
            }
            else sum = nums[i];
            if(sum > msum) msum = sum;
        }
        return msum;
    }
}