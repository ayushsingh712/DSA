class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i <= g.length -1 && j <= s.length -1){
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