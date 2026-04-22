class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;

        // convert 0 → -1
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) nums[i] = -1;
        }

        int sum = 0;
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < n; i++){
            sum += nums[i];

            if(map.containsKey(sum)){
                int last = map.get(sum);
                res = Math.max(res, i - last);
            } else {
                map.put(sum, i); // only first occurrence
            }
        }

        return res;
    }
}
