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
    static int cnt;
    public int pseudoPalindromicPaths (TreeNode root) {
        cnt=0;
        dfs(root,new int[10]);
        return cnt;
    }

    void dfs(TreeNode node,int[] freq){
        if(node==null)return;
        int val=node.val;
        freq[val]++;
        if(node.left==null && node.right==null){
            if(check(freq)){
                cnt+=1;
            }
            
            // for(int i:freq)System.out.print(i+" ");
            // System.out.println();
        }else{
            dfs(node.left,freq);
            dfs(node.right,freq);
        }
        freq[val]--;
               
    }

    boolean check(int[] freq){
        int f=0;
        for(int i:freq){
            if(i==0)continue;
            if(i%2!=0){
                f++;
            }
        }

        if(f<2)return true;
        else return false;
    }
}