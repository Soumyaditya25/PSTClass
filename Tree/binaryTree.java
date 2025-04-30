class Node{
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class binaryTree {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(3);
        root.left.left = new Node(40);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        root.left.right.left = new Node(6);
        root.left.right.left.left = new Node(11);
        root.left.right.left.right = new Node(13);
        root.left.right.left.left.right = new Node(15);
        root.right.left.right = new Node(4);
        root.right.left.right.left = new Node(50);
        root.right.left.right.right = new Node(8);
        System.out.println("Inorder traversal of binary tree is:");
        inorderTraversal(root);
        System.out.println();
        System.out.println("Preorder traversal of binary tree is:");
        preorderTraversal(root);
        System.out.println();
        System.out.println("Postorder traversal of binary tree is:");
        postorderTraversal(root);
        System.out.println();
    }
    public static void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
    public static void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    public static void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }
}