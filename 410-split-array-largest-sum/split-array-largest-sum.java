class Solution {

    public boolean isPossible(int[] nums, int k, int maxSumAllowed) {
        int subarrayCount = 1;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxSumAllowed) {
                return false;
            }
            if (currentSum + nums[i] <= maxSumAllowed) {
                currentSum += nums[i];
            } else {
                subarrayCount++;
                currentSum = nums[i];
            }
        }

        return subarrayCount <= k;
    }

    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}