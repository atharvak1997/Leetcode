/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        if(root != null) {
            answer = traversal(root, answer);
        }
        return answer;

    }

    public List<Integer> traversal(Node node, List<Integer> answer) {
        answer.add(node.val);

        for(int i = 0; i < node.children.size(); i++) {
            traversal(node.children.get(i), answer);
        }

        return answer;
    }
}