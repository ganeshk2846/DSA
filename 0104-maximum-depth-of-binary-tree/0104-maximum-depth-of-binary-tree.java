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

    private int max(TreeNode node)
    {
        if(node==null)
            return 0;
        
        int leftMax=max(node.left);
        int rightMax=max(node.right);

        return Math.max(leftMax+1,rightMax+1);

    }
    public int maxDepth(TreeNode root) {
        return max(root);
    }
}