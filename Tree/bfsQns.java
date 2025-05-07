import java.util.*;

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
public class bfsQns {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Left view of binary tree is:");
        leftView(root);
        System.out.println();
        System.out.println("Right view of binary tree is:");
        rightView(root);
        System.out.println();
    }
    public static void leftView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); 
        System.out.print(root.data + " ");

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode == null) {
                if (!queue.isEmpty()) {
                    System.out.print(queue.peek().data + " ");
                    queue.add(null); 
                }
            } else {
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
    }
    public static void rightView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); 
        System.out.print(root.data + " ");

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode == null) {
                if (!queue.isEmpty()) {
                    System.out.print(queue.peek().data + " ");
                    queue.add(null); 
                }
            } else {
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
            }
        }
    }
}
