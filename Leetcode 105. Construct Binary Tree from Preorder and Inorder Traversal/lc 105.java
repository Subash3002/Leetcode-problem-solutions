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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }

        TreeNode root=solve(preorder,inorder,0,preorder.length-1,0,inorder.length-1,hm);
        return root;
    }

    TreeNode solve(int[] preorder, int[] inorder,int preStart,int preEnd,int inStart,int inEnd,HashMap<Integer,Integer> hm){
        if(preStart>preEnd || inStart>inEnd)return null;

        TreeNode root=new TreeNode(preorder[preStart]);
        int rootInd=hm.get(root.val);
        int numsleft=rootInd-inStart;

        root.left=solve(preorder,inorder,preStart+1,preStart+numsleft,inStart,rootInd-1,hm);
        root.right=solve(preorder,inorder,preStart+numsleft+1,preEnd,rootInd+1,inEnd,hm);
        return root;
    }
}