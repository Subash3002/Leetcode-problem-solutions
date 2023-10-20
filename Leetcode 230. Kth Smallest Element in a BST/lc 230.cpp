/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int count=0;

    TreeNode* helper(TreeNode* root, int &k){
        if(root==NULL)return NULL;

        TreeNode *left=helper(root->left,k);
        if(left!=NULL){
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return helper(root->right,k);
    }

    int kthSmallest(TreeNode* root, int k) {
        TreeNode* ans=helper(root, k);
        return ans->val;

    }
};