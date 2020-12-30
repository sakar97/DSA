import java.util.*;

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node node) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        reverse(node, arr);
        return arr;
    }

    public static void reverse(Node node, ArrayList<Integer> res) {
        Stack<Node> s = new Stack<>();
        Queue<Node> q = new LinkedList<>();
        if (node == null)
            return;
        q.add(node);
        while (!q.isEmpty()) {
            node = q.poll();
            if (node.right != null) {
                q.add(node.right);
            }
            if (node.left != null) {
                q.add(node.left);
            }
            s.push(node);
        }
        while (!s.isEmpty()) {
            res.add(s.pop().data);
        }
    }
}