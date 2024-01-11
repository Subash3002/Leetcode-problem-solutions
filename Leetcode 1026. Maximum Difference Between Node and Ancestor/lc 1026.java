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
    public int maxAncestorDiff(TreeNode root) {
        if(root==null)return 0;
        int maxx=root.val;
        int minn=root.val;
        return solve(root,maxx,minn);
    }

    int solve(TreeNode root,int max,int min){
        if(root==null)return max-min;

        max=Math.max(max,root.val);
        min=Math.min(min,root.val);

        int maxLeftDiff=solve(root.left,max,min);
        int maxRightDiff=solve(root.right,max,min);

        return Math.max(maxLeftDiff,maxRightDiff);
    }
}