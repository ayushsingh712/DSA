class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n+1))/2;
        int act = 0;
        for(int i = 0;i<n;i++){
            act = act + nums[i];
        }
        int diff = sum - act;
        return diff;
    }
}