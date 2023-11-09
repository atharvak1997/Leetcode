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
    public int maxLevelSum(TreeNode root) {
        int MaxSum = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        int MaxLevel = 1;
        queue.add(root);

        while(!queue.isEmpty()) {
            int tempSum = 0;
            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++) {
                TreeNode node = queue.remove();
                tempSum += node.val;
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            if(tempSum > MaxSum) {
                MaxSum = tempSum;
                MaxLevel = level;
            }
            level++;
        }

        return MaxLevel;
    }
}