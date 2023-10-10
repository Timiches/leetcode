import java.util.HashMap;

public class t105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = inorder.length;
        for (int i = 0; i < n; i++)
            map.put(inorder[i], i);
        return build(preorder, 0, n - 1, 0, n - 1, map);
    }

    public TreeNode build(int[] preorder, int pL, int pH, int iL, int iH, HashMap<Integer, Integer> map) {
        if (pL > pH || iL > iH)
            return null;
        TreeNode root = new TreeNode(preorder[pL]);
        int currInd = map.get(root.val);
        int leftNodes = currInd - iL;
        root.left = build(preorder, pL + 1, pL + leftNodes, iL, currInd - 1, map);
        root.right = build(preorder, pL + leftNodes + 1, pH, currInd + 1, iH, map);
        return root;
    }
}
