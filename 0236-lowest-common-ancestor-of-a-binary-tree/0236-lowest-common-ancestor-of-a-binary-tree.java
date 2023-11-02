/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return preorder(root, p, q);
    }

    public TreeNode preorder(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) {
            return null;
        }

        if(node == p || node == q) {
            return node;
        }
        TreeNode l = preorder(node.left, p, q);
        TreeNode r = preorder(node.right, p, q);

        if(l != null && r != null) {
            return node;
        }
        if(l != null) {
            return l;
        }
        
        return r;
    }
}