class Solution {
    int max = Integer.MIN_VALUE;
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return count;
        max = Math.max(root.val, max);
        if(root.val == max) count++;
        int curMax = max;
        int l = goodNodes(root.left);
        max = Math.max(root.val, curMax);
        int r = goodNodes(root.right);
        return count;
    }
}
