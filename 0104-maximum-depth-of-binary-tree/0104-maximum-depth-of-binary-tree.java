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
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        maxDepth = postorder(root, 0);
        return maxDepth;
    }

    public int postorder(TreeNode node, int maxDepth) {
        if(node == null) {
            return 0;
        }

        int left = postorder(node.left, maxDepth);
        int right = postorder(node.right, maxDepth);
        maxDepth = Math.max(maxDepth, Math.max(left, right) + 1);

        return Math.max(left, right) + 1;
    }
}