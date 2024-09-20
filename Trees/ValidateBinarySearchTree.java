/*
 Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left 
subtree
 of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        inorderTraverse(root, sortedList);

        for(int i=0; i < sortedList.size()-1; i++)
        {    
            if(sortedList.get(i) >= sortedList.get(i+1))
                return false;
        }

        return true;
    }

    public void inorderTraverse(TreeNode root,ArrayList<Integer> sortedList)
    {
        if(root != null)
        {
            inorderTraverse(root.left, sortedList);
            sortedList.add(root.val);
            inorderTraverse(root.right, sortedList);
        }
    }
}