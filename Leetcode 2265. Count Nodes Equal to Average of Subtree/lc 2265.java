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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        traverse(root);
        return ans;
    }

    int[] traverse(TreeNode node){
        if(node==null) {
            int[] arr={0,0};
            return arr;
        }
        int[] left=traverse(node.left);
        int[] right=traverse(node.right);
        int sum=node.val+left[0]+right[0];
        int count=1+left[1]+right[1];
        int avg=sum/count;
        if(avg==node.val)ans++;
        int[] arr={sum,count};
        return arr;

    }
}