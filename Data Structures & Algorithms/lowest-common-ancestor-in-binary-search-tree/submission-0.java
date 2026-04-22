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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if(root == null) return root;
        if(root.left == null && root.right == null && (root.val == p.val && root.val == q.val)) return root;
        TreeNode l = lowestCommonAncestor(root.left,p,q);
        TreeNode r = lowestCommonAncestor(root.right,p,q);
        TreeNode mid = root;
        if((l == null && r == null) && (mid.val == p.val || mid.val == q.val)) return mid;
        if((l == null && r == null) && (mid.val != p.val || mid.val != q.val)) return null;
        if(((l == null && r != null) || (l != null && r == null)) && (mid.val == p.val || mid.val == q.val)) return mid;
        if((l == null && r != null) && (mid.val != p.val || mid.val != q.val)) return r;
        if((l != null && r == null) && (mid.val != p.val || mid.val != q.val)) return l; 
        return mid;
    }
}
