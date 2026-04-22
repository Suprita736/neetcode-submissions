/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int depth(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int mid = 1 + Math.max(depth(root.left),depth(root.right));
        return mid;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);
        int mid = Math.abs(depth(root.left)-depth(root.right));
        if(mid > 1) return false;
        return l && r;
    }
}
