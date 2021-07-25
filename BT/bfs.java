import java.util.*;

class Level_order_traversal {
    // You are required to complete this method
    static ArrayList<Integer> levelOrder(Node node) {
        // Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        levelOrder(node, arr);
        return arr;
    }

    public static void levelOrder(Node node, ArrayList<Integer> res) {
        Queue<Node> q = new LinkedList<>();
        if (node == null)
            return;
        q.add(node);
        while (!q.isEmpty()) {
            node = q.poll();
            res.add(node.data);
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
    }
}
