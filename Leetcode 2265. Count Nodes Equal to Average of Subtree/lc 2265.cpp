/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     T,reeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int ans=0;
    pair<int,int> traverse(TreeNode *node){
        if(node==nullptr)return {0,0};
        pair<int,int> left=traverse(node->left);
        pair<int,int> right=traverse(node->right);
        int sum=node->val+left.first+right.first;
        int count=1+left.second+right.second;
        int avg=sum/count;
        if(avg==node->val)ans++;
        return {sum,count};
    }
    int averageOfSubtree(TreeNode* root) {
        traverse(root);
        return ans;
    }
};