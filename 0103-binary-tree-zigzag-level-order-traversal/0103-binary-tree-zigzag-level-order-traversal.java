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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        
        Queue<TreeNode> queue=new LinkedList<>();
        boolean leftToRight=true;

        queue.add(root);
        while(!queue.isEmpty())
        {
            int currentSize = queue.size();
            Integer currentLevel[] = new Integer[currentSize];

            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                
                int index = leftToRight ? i : (currentSize - 1 - i);
                currentLevel[index] = node.val;
                
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(Arrays.asList(currentLevel));
            leftToRight = !leftToRight;
        }
        return result;
    }
}