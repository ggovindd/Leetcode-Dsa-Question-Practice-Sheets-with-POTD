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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();  if (root == null) {
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
      q.offer(root);  while(!q.isEmpty()){
            int n=q.size();
            TreeNode rightview=null;
            while(n-->0){ rightview= q.poll();      
               if (rightview.left!=null) {
                    q.offer(rightview.left);
                }
                if (rightview.right!=null) {
                    q.offer(rightview.right);
                }

            } list.add(rightview.val);
        } return list;
    }
}