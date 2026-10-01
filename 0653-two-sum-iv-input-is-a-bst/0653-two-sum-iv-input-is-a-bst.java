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
class Solution { boolean flag=false;
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
       
        solve(root,k,set);
        return flag;
    }  void solve(TreeNode root, int k ,Set<Integer> set){
        if(root==null) return;
        if(set.contains(k-root.val)){
            flag=true; 
            return;
        } else{
            set.add(root.val);
            solve(root.left,k,set);
            solve(root.right,k,set);
        } 

    }
}