class Solution {
    List < List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum,0,new ArrayList<>());
        return ans;
    }
    public void dfs(TreeNode root,int targetSum,int sum,List<Integer> path){
        if(root == null) return;
        path.add(root.val); // add in path list
        sum = sum+root.val; // update the sum
        if(root.left == null && root.right == null && sum == targetSum){
            ans.add(new ArrayList<>(path)); 
        }

        dfs(root.left,targetSum,sum,path);
        dfs(root.right,targetSum,sum,path);
        path.remove(path.size()-1); // backtracking
    }
}