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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(postorder(root) == -1) {
            return false;
        }
        return true;
    }

    public int postorder(TreeNode node) {
        if(node == null) {
        return 0;
    }

    int left = postorder(node.left);
    int right = postorder(node.right);
    if(Math.abs(left - right) > 1 || left < 0 || right < 0) {
        return -1;
    }

    return Math.max(left, right) + 1;
    }
}