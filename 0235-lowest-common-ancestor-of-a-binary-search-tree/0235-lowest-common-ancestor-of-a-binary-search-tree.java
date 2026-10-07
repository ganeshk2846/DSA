/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode target=new TreeNode();
    private void find(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root==null)
        return;
        
        if(p.val > root.val && q.val > root.val)
        {
            find(root.right,p,q);
        }
        else if(p.val < root.val && q.val < root.val)
            find(root.left,p,q);
        else
        {
            target=root;
            return;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        target=root;
        find(root,p,q);
        return target;

    }
}