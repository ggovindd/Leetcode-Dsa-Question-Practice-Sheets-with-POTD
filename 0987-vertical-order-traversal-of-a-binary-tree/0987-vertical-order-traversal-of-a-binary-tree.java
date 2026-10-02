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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
      List<List<Integer>> ans=new ArrayList<>();

        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();

        Map <Integer,List<int[]>> map=new TreeMap<>();
        q.offer(root);

       Queue<Integer> colQueue=new LinkedList<>();
       colQueue.offer(0);
       Queue<Integer> rowQueue = new LinkedList<>();
       rowQueue.offer(0);
        while(!q.isEmpty()){

            int n=q.size();

            while(n-->0){
                TreeNode node=q.poll();
                int col=colQueue.poll();
                 int row=rowQueue.poll();
                if(!map.containsKey(col)){
                    map.put(col,new ArrayList<>());
                }  
                map.get(col).add(new int[]{row, node.val});

                if(node.left!=null){ 
                   colQueue.offer(col-1);
                    q.offer(node.left);
                    rowQueue.offer(row+1);
                } 
                if(node.right!=null) {
                    colQueue.offer(col+1);
                    q.offer(node.right);
                      rowQueue.offer(row+1);
                }
            }
        } 
        for(Map.Entry<Integer, List<int[]>> entry : map.entrySet()) {
    List<int[]> list = entry.getValue();

    Collections.sort(list, (a,b) -> {
        if(a[0] != b[0]) {
            return a[0] - b[0];
        }
        return a[1] - b[1];
    });

    List<Integer> temp = new ArrayList<>();
    for(int[] arr:list) {
        temp.add(arr[1]);
    }

    ans.add(temp);
}
        return ans;
    } 
}