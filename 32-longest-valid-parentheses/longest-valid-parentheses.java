class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxlen = 0;
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '(') st.push(i);
            else {
                st.pop();
                if(st.size() == 0){
                    st.push(i);
                }
                else {
                    int currlen = i - st.peek();
                    maxlen = Math.max(maxlen,currlen);
                }
            }
        }
        return maxlen;
    }
}