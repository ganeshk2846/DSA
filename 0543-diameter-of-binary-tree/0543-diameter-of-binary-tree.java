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
    int count=0;
    private int maxDia(TreeNode node)
    {
        if(node==null)
            return 0;

        int lf=maxDia(node.left);
        int rt=maxDia(node.right);
        count=Math.max((lf+rt),count);
        return Math.max(lf,rt)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int a=maxDia(root);
        return count;
    }
}