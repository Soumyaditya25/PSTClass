import java.util.Stack;
public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Original Stack: " + stack);
        
        reversestack(stack);
        
        System.out.println("Reversed Stack: " + stack);
    }

    static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        
        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }

    static void reversestack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        
        int top = stack.pop();
        reversestack(stack);
        insertAtBottom(stack, top);
    }
}
