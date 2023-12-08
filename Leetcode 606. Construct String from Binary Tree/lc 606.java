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

    void dfs(TreeNode node,StringBuilder ans){
        if(node!=null){
            ans.append(String.valueOf(node.val));
        }
        if(node.left==null && node.right==null)return;
        
        ans.append('(');
        if(node.left!=null)dfs(node.left,ans);
        ans.append(')');
        
        if(node.right!=null){
            ans.append('(');
            dfs(node.right,ans);
            ans.append(')');
        }
    }

    public String tree2str(TreeNode root) {
        StringBuilder ans=new StringBuilder();
        dfs(root,ans);
        return ans.toString();

    }
}