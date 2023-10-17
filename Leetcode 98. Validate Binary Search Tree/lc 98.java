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
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    boolean isValid(TreeNode root,long minvalue,long maxvalue){
        if(root==null)return true;

        if(root.val<=minvalue || root.val>=maxvalue)return false;

        return isValid(root.left,minvalue,root.val) && isValid(root.right,root.val,maxvalue);
    }
}