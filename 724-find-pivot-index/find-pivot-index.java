class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        for(int i =0;i<n ; i++){
            int right = sum - left - nums[i];

            if(left == right) return i;
            left += nums[i];
        } 
       
        return -1;
    }
}