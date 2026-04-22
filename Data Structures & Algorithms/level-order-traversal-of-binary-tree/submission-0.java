
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return l;
        int i=0;
        q.add(root);
        int c = q.size();
        while(q.size() != 0){
            l.add(new ArrayList<>());
            while(c != 0){
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                l.get(i).add(q.poll().val);
                c--;
            }
            c = q.size();
            i++;
        }
        return l;
    }
}
