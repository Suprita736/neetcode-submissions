class Solution {
    int pre = 0;
    int in = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return BST(preorder, inorder, Integer.MAX_VALUE);
    }

    public TreeNode BST(int[] preorder, int[] inorder, int limit){
        if(pre >= preorder.length) return null;
        if(inorder[in] == limit){
            in++;
            return null;
        }

        TreeNode root = new TreeNode(preorder[pre++]);
        root.left = BST(preorder, inorder, root.val);
        root.right = BST(preorder, inorder, limit);
        return root;
    }
}









