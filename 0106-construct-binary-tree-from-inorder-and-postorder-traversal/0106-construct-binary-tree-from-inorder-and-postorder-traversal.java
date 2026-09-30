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
    private int postOrderIndex;
    private Map<Integer,Integer> inorderMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inorderMap = new HashMap<>();
        postOrderIndex=postorder.length-1;

        for(int i=0;i<inorder.length;i++)
            inorderMap.put(inorder[i],i);
        
        return buildTree(postorder,0,postorder.length-1);
    }
    private TreeNode buildTree(int[] postOrder,int left,int right)
    {
        if(left>right)
            return null;

        int rootValue=postOrder[postOrderIndex];
        postOrderIndex--;
        TreeNode root=new TreeNode(rootValue);

        int inorderRootIndex=inorderMap.get(rootValue);
        root.right=buildTree(postOrder,inorderRootIndex+1,right);
        root.left=buildTree(postOrder,left,inorderRootIndex-1);
        

        return root;
    }
}