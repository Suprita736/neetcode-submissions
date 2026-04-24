class Solution {
    public boolean l(TreeNode root, int x){
        if(root != null && root.val >= x) return false;
        if(root == null) return true;
        boolean left = l(root.right, x);
        return left;
    }
    public boolean r(TreeNode root, int x){
        if(root != null && root.val <= x) return false;
        if(root == null) return true;
        boolean right = r(root.left, x);
        return right;
    }
    public boolean isValid(TreeNode root, int x){
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        boolean l = isValid(root.left, root.val);
        boolean r = isValid(root.right, root.val);
        if(l != false && root.left != null && root.left.val < root.val && root.left.right != null) l = l(root.left.right, root.val);
        if(root.left != null && root.left.val >= root.val) l = false;
        if(r != false && root.right != null && root.right.val > root.val && root.right.left != null) r = r(root.right.left, root.val);
        if(root.right != null && root.right.val <= root.val) r = false;
        return l && r;
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        boolean b = isValid(root, root.val);
        return b;
    }
}
