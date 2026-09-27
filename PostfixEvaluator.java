public class PostfixEvaluator {

    public static int evaluate(String expression) {
        Stack stack = new Stack(50);
        String[] tokens = expression.split("\\s+");

        System.out.println("Evaluating postfix expression: " + expression);
        System.out.println();

        for (String token : tokens) {

            if (token.matches("-?\\d+")) {
                int value = Integer.parseInt(token);
                stack.push(value);
                System.out.print("Token: " + token + "  ->  push " + value);
                System.out.print("  |  Stack: ");
                stack.displayStack();
                System.out.println();

            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;

                switch (token) {
                    case "+": result = operand1 + operand2; break;
                    case "-": result = operand1 - operand2; break;
                    case "*": result = operand1 * operand2; break;
                    case "/": result = operand1 / operand2; break;
                }

                stack.push(result);
                System.out.print("Token: " + token + "  ->  pop " + operand2 + ", pop " + operand1
                                + ", compute " + operand1 + " " + token + " " + operand2 + " = " + result);
                System.out.print("  |  Stack: ");
                stack.displayStack();
                System.out.println();
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "5 3 + 2 *";
        int result = evaluate(expression);
        System.out.println();
        System.out.println("Final Result of \"" + expression + "\" = " + result);
    }
}