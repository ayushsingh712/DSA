class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int le = 0;
        for(int i = 0; i < n;i++){
            if(nums[i] % 2 == 0){
                int tmp = nums[le];
                nums[le] = nums[i];
                le++;
                nums[i] = tmp;
            }
        }
        return nums;
    }
}