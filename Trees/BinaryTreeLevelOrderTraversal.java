/*
 * Given the root of a binary tree, return the level order traversal of its nodes' values. 
 * (i.e., from left to right, level by level).
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        if(root==null)
        {
            return result;
        }

        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            int count = queue.size();
            List<Integer> level = new LinkedList<Integer>();

            for(int i = 0; i < count; i++){
                TreeNode temp = queue.poll();
                level.add(temp.val);

                if(temp.left != null)
                {
                    queue.offer(temp.left);
                }

                if(temp.right!=null)
                {
                    queue.offer(temp.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}