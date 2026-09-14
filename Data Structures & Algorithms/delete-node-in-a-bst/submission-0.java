class Solution {
    Queue<Integer> q = new LinkedList<>();
    public void que(TreeNode root) {
        if(root == null) return;
        q.add(root.val);
        que(root.left);
        que(root.right);
        return;
    }
    public TreeNode create(TreeNode root,int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        if(root.val > val) root.left = create(root.left, val);
        else root.right = create(root.right, val);
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        que(root);
        TreeNode head = null;
        TreeNode temp = head;
        while(!q.isEmpty()) {
            if(q.peek() == key) q.poll();
            else if(head == null) {
                head = new TreeNode(q.poll());
                temp = head;
            }
            else {
                if(head.val > q.peek()) temp.left = create(head.left, q.peek());
                else temp.right = create(head.right, q.peek());
                q.poll();
            }
        }
        return head;
    }
}