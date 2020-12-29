import java.util.*;

class level_tra {
    static Scanner sc = null;

    public static void main(String args[]) {
        sc = new Scanner(System.in);
        Node n = create();
        inOrder(n);
        preOrder(n);
        postOrder(n);
    }

    public static Node create() {
        Node root = null;
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        root.left = create();
        root.right = create();
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data);
        inOrder(root.left);
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data);
    }
}

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
    }
}
