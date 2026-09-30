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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> mergeList=new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
        int i=0;
        int j=0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergeList.add(list1.get(i));
                i++;
            } else {
                mergeList.add(list2.get(j));
                j++;
            }
        }

        while (i<list1.size()) {
            mergeList.add(list1.get(i));
            i++;
        }

        while (j<list2.size()) {
            mergeList.add(list2.get(j));
            j++;
        }

        return mergeList;
    
    } void inorder(TreeNode root, List<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
} 
// Problem No :- 1305      (All Elements in Two BST)