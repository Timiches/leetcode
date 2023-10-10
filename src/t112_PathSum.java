public class t112_PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.val == sum && root.right == null && root.left == null)
            return true;
        if (root.left != null)
            root.left.val += root.val;
        if (root.right != null)
            root.right.val += root.val;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
