/*
Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. 
Answers within 10-5 of the actual answer will be accepted.
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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Double> result = new ArrayList<>();

        while(q.size() > 0)
        {
            double qLength = q.size();
            double sum = 0;

            for(int i = 0; i < qLength; i++)
            {
                TreeNode current = q.poll();
                sum += current.val;

                if(current.left != null)
                    q.offer(current.left);
                if(current.right != null)
                    q.offer(current.right);
            }

            result.add(sum / qLength);
        }

        return result;
    }
}