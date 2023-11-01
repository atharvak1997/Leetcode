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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> answer1 = new ArrayList<>();
        ArrayList<Integer> answer2 = new ArrayList<>();

        answer1 = inorder(root1, answer1);
        
        answer2 = inorder(root2, answer2);
        return answer1.equals(answer2);
    }
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arrList) {
            if(root == null) {
                return new ArrayList<>();
            }
            if(root.left == null && root.right == null) {
                arrList.add(root.val);
            }
            inorder(root.left, arrList);
            if(root.left == null && root.right == null) {
                arrList.add(root.val);
            }
            inorder(root.right, arrList);

            return arrList;
        }
}