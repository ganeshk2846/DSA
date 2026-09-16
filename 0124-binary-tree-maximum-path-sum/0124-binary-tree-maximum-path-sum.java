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
    int sum=Integer.MIN_VALUE;
    private int maxSum(TreeNode node)
    {
        if(node==null)
            return 0;

        int lsum=Math.max(0,maxSum(node.left));
        int rsum=Math.max(0,maxSum(node.right));

        sum = Math.max(sum,(lsum+rsum)+node.val);

        return Math.max(lsum,rsum)+node.val;
    }
    public int maxPathSum(TreeNode root) {
        int a=maxSum(root);
        return sum;
    }
}