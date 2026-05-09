class Solution {
    int min = Integer.MAX_VALUE;
    public int Minimum(TreeNode root){
        if(root == null) return min;
        int l = Minimum(root.left);
        int r = Minimum(root.right);
        min = Math.min(l,Math.min(r,root.val));
        return min;
    }
    public void Min(TreeNode root){
        if(root == null) return;
        if(root.val == min) {root.val = Integer.MAX_VALUE;
        min = Integer.MAX_VALUE;}
        Min(root.left);
        Min(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val;
        for(int i=0;i<k;i++){
            Min(root);
            min = Minimum(root);
        }
        return min;
    }
}
