class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;

        HashSet<Integer> set = new HashSet<>();

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            } 
            else if (nums1[i] > nums2[j]) {
                j++;
            } 
            else {
                set.add(nums1[i]);   // common element add
                i++;
                j++;
            }
        }

        int[] ans = new int[set.size()];
        int index = 0;

        for (int num : set) {
            ans[index++] = num;
        }

        return ans;
    }
}