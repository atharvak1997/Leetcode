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
    int maxDia= 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxDia = new int[1];
        postorder(root, maxDia);
        return maxDia[0];
    }
    
    public int postorder(TreeNode node, int[] maxDia) {
        if(node == null) {
            return -1;
        }
        
        int left = postorder(node.left, maxDia);
        int right = postorder(node.right, maxDia);
        maxDia[0] = Math.max(maxDia[0], left + right + 2);
        
        return Math.max(left, right) + 1;
        
    }
}