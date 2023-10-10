public class t101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return sym(root.left, root.right);
    }

    private boolean sym(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null || p.val != q.val)
            return false;
        return sym(p.right, q.left) && sym(p.left, q.right);
    }
}
