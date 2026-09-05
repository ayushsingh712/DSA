class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int left = 0;
        int right = height.length -1;
        while(left < right){
            int minlen = Math.min(height[left],height[right]);
            int width = right - left;
            int area = minlen * width;
            maxwater = Math.max(maxwater,area);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxwater;
    }
}