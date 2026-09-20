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
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    private void preorder(TreeNode node,int sum,int target)
    {
        if(node==null)
            return;
        list.add(node.val);
        sum += node.val;
        if(node.left==null && node.right==null && sum==target)
        {
            result.add(new ArrayList<>(list));
        }

        preorder(node.left,sum,target);
        preorder(node.right,sum,target);

        list.removeLast();
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        preorder(root,0,targetSum);
        return result;
    }
}