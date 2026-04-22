class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return l;
        q.add(root);
        int c = q.size();
        while(q.size() != 0){
            while(c != 0){
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                if(c == 1) l.add(q.poll().val);
                else q.poll();
                c--;
            }
            c = q.size();
        }
        return l;
    }
}
