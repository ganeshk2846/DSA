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
    public boolean validate_bst(TreeNode node,long min,long max)
    {
        if(node==null)
            return true;
        if(node.val<=min || node.val>=max)
            return false;

        return validate_bst(node.left,min,node.val) && validate_bst(node.right,node.val,max) ; 
    }
    public boolean isValidBST(TreeNode root) {

        return validate_bst(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}