class Solution { 
    long min; 
    long smin = Long.MAX_VALUE; 

    private void fsmv(TreeNode node) { 
        if (node == null) return; 
        
        if (node.val > min && node.val < smin) { 
            smin = node.val; 
        } 
        
        fsmv(node.left); 
        fsmv(node.right); 
    } 

    public int findSecondMinimumValue(TreeNode root) { 
        if (root == null) return -1;
        
        min = root.val; 
        fsmv(root); 
        
        return smin == Long.MAX_VALUE ? -1 : (int) smin; 
    } 
}
