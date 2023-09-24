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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Deque<TreeNode> dq=new LinkedList<>();
        dq.offer(root);
        Boolean reverse=false;

        while(!dq.isEmpty()){
            int levelSize=dq.size();
            List<Integer> lvl=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                if(!reverse){
                    TreeNode current=dq.pollFirst();
                    if(current.left!=null) dq.addLast(current.left);
                    if(current.right!=null) dq.addLast(current.right);
                    lvl.add(current.val);
                }
                else{
                    TreeNode current=dq.pollLast();
                    if(current.right!=null) dq.addFirst(current.right);
                    if(current.left!=null) dq.addFirst(current.left);
                    lvl.add(current.val);
                }
            }
            reverse=!reverse;
            res.add(lvl);
            
        }
        return res;
    }
}