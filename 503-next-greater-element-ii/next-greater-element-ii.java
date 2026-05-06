class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack <Integer> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2*n-1;i>=0;i--){
            if(st.size()==0) arr.add(-1);
            else if(st.size() > 0 && st.peek() > nums[i%n]){
                arr.add(st.peek());
            }
            else if(st.size() > 0 && st.peek()<=nums[i%n]){
                while(st.size() > 0 && st.peek()<=nums[i%n]){
                    st.pop();
                }
                if(st.size()==0) arr.add(-1);
                else arr.add(st.peek());
            }
            st.push(nums[i%n]);
        }
        Collections.reverse(arr);
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
        ans[i] = arr.get(i);
        }
        return ans;
    }
}