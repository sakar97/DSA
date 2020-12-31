class height {
    int height(Node node) {
        // code here
        if (node == null)
            return 0;
        int ldepth = height(node.left);
        int rdepth = height(node.right);
        if (ldepth > rdepth) {
            return ldepth + 1;
        } else {
            return rdepth + 1;
        }
    }
}
