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
class Solution { int left;
    public int findBottomLeftValue(TreeNode root) {
         bfs(root); 
         return left;
    }void bfs(TreeNode root) {
    if (root == null) return;

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    while(!q.isEmpty()){
            int n=q.size();
             for (int i = 0; i < n; i++) {
                TreeNode node=q.poll();
                if (i == 0) {
                    left = node.val;
                }

                if(node.left!=null) {
                    q.offer(node.left);
                   
                }
                if(node.right!=null) {
                    q.offer(node.right);
                    left=node.val;
                }
            }
    }
}
}