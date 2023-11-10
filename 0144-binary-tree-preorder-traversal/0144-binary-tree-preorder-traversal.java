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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return traversal(root, list);
    }

    public List<Integer> traversal(TreeNode node, List<Integer> list) {
        if(node == null) {
            return new ArrayList<>();
        }
        list.add(node.val);
        traversal(node.left, list);
        traversal(node.right, list);

        return list;

    }
}