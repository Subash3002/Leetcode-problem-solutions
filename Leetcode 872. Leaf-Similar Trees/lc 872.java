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
    boolean compare(List<Integer> a1,List<Integer> a2){
        if(a1.size()!=a2.size()) return false;

        for(int i=0;i<a1.size();i++){
            if(a1.get(i)!=a2.get(i)) return false;
        }
        return true;
    }
    void solve(List<Integer> a1,TreeNode root){
        if(root==null)return ;
        if(root.left==null && root.right==null){
            a1.add(root.val);
            return;
        }
        if(root.left!=null)solve(a1,root.left);
        if(root.right!=null)solve(a1,root.right);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a1=new ArrayList<>();
        solve(a1,root1);
        List<Integer> a2=new ArrayList<>();
        solve(a2,root2);
        return compare(a1,a2);
    }
}