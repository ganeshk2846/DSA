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

    private void traverse(TreeNode node,List<Integer> ans,int level)
    {
        if(node==null)
            return;
        if(level==ans.size())
            ans.add(node.val);
        traverse(node.right,ans,level+1);
        traverse(node.left,ans,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        traverse(root,ans,0);
        return ans;

    }
}