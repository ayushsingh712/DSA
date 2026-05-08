class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int mine = 0; // e for Ending
        int mins = 0; // s for sum
        int maxe = 0; 
        int maxs = 0;
        for(int i = 0;i<nums.length;i++){
            
            maxe = Math.max(nums[i],nums[i]+maxe);
            maxs = Math.max(maxe,maxs);

            mine = Math.min(nums[i],nums[i]+mine);
            mins = Math.min(mine,mins);

        }
        return Math.max(Math.abs(maxs),Math.abs(mins));
    }
}