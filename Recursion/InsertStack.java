import java.util.Stack;
public class InsertStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Original Stack: " + stack);
        
        insertAtBottom(stack, 4);
        
        System.out.println("Stack after inserting at bottom: " + stack);
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
}
