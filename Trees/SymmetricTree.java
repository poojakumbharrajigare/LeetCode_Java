/*
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        
        return checkSymmetry(root.left, root.right);
    }

    private boolean checkSymmetry(TreeNode leftRoot, TreeNode rightRoot)
    {
        if(leftRoot == null && rightRoot == null)
            return true;

        if(leftRoot == null || rightRoot == null)
            return false;

        return leftRoot.val == rightRoot.val && checkSymmetry(leftRoot.left, rightRoot.right) && checkSymmetry(leftRoot.right, rightRoot.left);
    }
}