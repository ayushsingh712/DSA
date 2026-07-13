class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int ab = helper(root);
        if (ab == -1) return false;
        else return true;
    }
    public int helper(TreeNode root) {
        if (root == null) return 0;
        int l = helper(root.left);
        if (l == -1) return -1;
        int r = helper(root.right);
        if (r == -1) return -1;
        int d = l - r;
        int ab = Math.abs(d);
        if (ab > 1) return -1;
        return 1 + Math.max(l, r);
    }
}