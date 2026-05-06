class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        Stack<Integer> st = new Stack<>();

        int[] ans = new int[n];

        for(int i = 2*n - 1; i >= 0; i--){

            if(st.size() == 0){
                if(i < n) ans[i] = -1;
            }

            else if(st.size() > 0 && st.peek() > nums[i % n]){
                if(i < n) ans[i] = st.peek();
            }

            else if(st.size() > 0 && st.peek() <= nums[i % n]){

                while(st.size() > 0 && st.peek() <= nums[i % n]){
                    st.pop();
                }

                if(st.size() == 0){
                    if(i < n) ans[i] = -1;
                }
                else{
                    if(i < n) ans[i] = st.peek();
                }
            }

            st.push(nums[i % n]);
        }

        return ans;
    }
}