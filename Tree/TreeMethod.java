// import java.util.*;
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
public class TreeMethod {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("size of binary tree is:");
        System.out.println(sizeOfTree(root));
        System.out.println("sum of binary tree is:");
        System.out.println(count_sum(root));
        System.out.println("max value of binary tree is:");
        System.out.println(max_value(root));
        System.out.println("height of binary tree is:");
        System.out.println(heightOfTree(root));
        System.out.println("search in binary tree is:");
        System.out.println(search(root, 5)); // true
        System.out.println(search(root, 8)); // false
    }
    public static int sizeOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSize = sizeOfTree(root.left);
        int rightSize = sizeOfTree(root.right);
        int size = leftSize + rightSize + 1; // +1 for the current node
        return size;
    }
    public static int count_sum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = count_sum(root.left);
        int rightSum = count_sum(root.right);
        int sum = leftSum + rightSum + root.data; // +1 for the current node
        return sum;
    }
    public static int max_value(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = max_value(root.left);
        int rightMax = max_value(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1; // +1 for the current node
    }
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return search(root.left, key) || search(root.right, key);
    }
}
