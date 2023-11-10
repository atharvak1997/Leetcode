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
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> arrList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            long tempSum = 0;
            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++) {
                TreeNode node = queue.remove();
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                tempSum += node.val;
            }

            arrList.add(tempSum);
        }

        Collections.sort(arrList);
        if(k > arrList.size()) {
            return -1;
        }

        return arrList.get(arrList.size() - k);
    }
}