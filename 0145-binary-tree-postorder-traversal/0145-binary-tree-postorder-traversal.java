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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if(root != null) {
            answer = traversal(root, answer);
        }

        return answer;
    }

    public List<Integer> traversal(TreeNode node, List<Integer> answer) {
        if(node == null) {
            return new ArrayList<>();
        }

        traversal(node.left, answer);
        traversal(node.right, answer);
        answer.add(node.val);

        return answer;
    }
}