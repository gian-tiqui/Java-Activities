package data_structures;

class Node {
    int val;
    Node left, right;

    public Node(int num) {
        this.val = num;
        this.left = this.right = null;
    }
}

public class Tree {

    public Node root;

    public Tree(int num) {
        this.root = new Node(num);
    }

    public void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public Node insert(Node root, int num) {

        if (root == null)
            root = new Node(num);
        else if (num < root.val)
            root.left = insert(root.left, num);
        else
            root.right = insert(root.right, num);

        return root;
    }

    public void reverse(Node root) {
        if (root == null)
            return;

        reverse(root.left);
        reverse(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

}
