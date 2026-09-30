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
class Solution { int sum=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> list =new  ArrayList<>();

        solve(root,list);
        Map<Integer,Integer> map = new HashMap<>();

        for (int sum:list) {
         map.put(sum,map.getOrDefault(sum,0) + 1);
        }
        int max=0;
        for(int maxVal:map.values()){
            max=Math.max(max,maxVal);
        }
        List<Integer> ans =new  ArrayList<>();
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
    if (i.getValue() == max) {
        ans.add(i.getKey());
    }
}
        int[] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
        arr[i] = ans.get(i);
        } return arr;
    } int solve(TreeNode root,List<Integer> list ){
        if(root==null) return 0;
        // if(root.left == null && root.right == null){
        //     return sum;
        // }
         int left = solve(root.left,list);
         int right =solve(root.right,list);
         list.add(root.val+left+right);
         return root.val+left+right; 
    }
}