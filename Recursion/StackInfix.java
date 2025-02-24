import java.util.Stack;

public class StackInfix {
    public static void main(String[] args) {
        String str = "(2+3*(3*5)+(2+9))";
        System.out.println(solve(str)); 
    }

    public static int solve(String str) {
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                operand.push(ch - '0'); 
            } else if (ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    int b = operand.pop();
                    int a = operand.pop();
                    char opr = operator.pop();
                    operand.push(performOperation(a, b, opr));
                }
                operator.pop(); 
            } else {
                while (!operator.isEmpty() && operator.peek() != '(' &&
                        priorityCheck(operator.peek()) >= priorityCheck(ch)) {
                    int b = operand.pop();
                    int a = operand.pop();
                    char opr = operator.pop();
                    operand.push(performOperation(a, b, opr));
                }
                operator.push(ch);
            }
        }

        while (!operator.isEmpty()) {
            int b = operand.pop();
            int a = operand.pop();
            char opr = operator.pop();
            operand.push(performOperation(a, b, opr));
        }

        return operand.pop();
    }

    public static int performOperation(int a, int b, char ch) {
        if (ch == '+') return a + b;
        if (ch == '-') return a - b;
        if (ch == '*') return a * b;
        if (ch == '/') return a / b;
        return 0; 
    }

    public static int priorityCheck(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }
}