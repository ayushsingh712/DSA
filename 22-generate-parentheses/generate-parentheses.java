class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> ans = new ArrayList<>();
        gen(n,0,0,ans,""); // n,l,r,ans,""
        return ans;
    }
    public void gen(int n,int l,int r,List <String> ans,String s){ 
        if(r == n) {
            ans.add(s);
            return;
        }
        if(l < n) gen(n,l+1,r,ans,s+"(");
        if(r < l) gen(n,l,r+1,ans,s+")");
    }
}