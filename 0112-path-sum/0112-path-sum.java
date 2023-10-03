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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return inorder(root, 0, targetSum);
    }

    public boolean inorder(TreeNode node, int curSum, int targetSum) {
        if(node == null) {
            return false;
        }

        curSum += node.val;
        if(node.left == null && node.right == null && curSum == targetSum) {
            return true;
        }

        return (inorder(node.left, curSum, targetSum) || inorder(node.right, curSum, targetSum));
    }
}