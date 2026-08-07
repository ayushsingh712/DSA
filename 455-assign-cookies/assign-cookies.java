class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; 
        int j = 0;
        int m = g.length;
        int n = s.length;
        while(i < m && j < n){
            if(s[j] >= g[i]){
                res++;
                j++;
                i++;
            }
            else j++;
        }
        return res;
    }
}