
public class AInfixToPostfixMain {

	public static int prio(char opr) {
        switch (opr) {
            case '$':
                return 11;
            case '/':
                return 10;
            case '*':
                return 10;
            case '%':
                return 10;
            case '+':
                return 9;
            case '-':
                return 9;
        }
        return 0;
    }

    public static String infixToPostfix(String infix) {
    	AInfixToPostfix post = new AInfixToPostfix(40);
        StringBuilder postfix = new StringBuilder();

        String[] tokens = infix.split("\\s+");

        for (String token : tokens) {
            if (isNumeric(token)) {
                postfix.append(token).append(" ");
            } else if (token.equals("(")) {
                post.push(token);
            } else if (token.equals(")")) {
                while (!post.isEmpty() && !post.peek().equals("(")) {
                    postfix.append(post.pop()).append(" ");
                }
                post.pop();  
            } else if (isOperator(token)) {
                while (!post.isEmpty() && prio(post.peek().charAt(0)) >= prio(token.charAt(0)) && !post.peek().equals("(")) {
                    postfix.append(post.pop()).append(" ");
                }
                post.push(token);
            }
        }

        while (!post.isEmpty()) {
            postfix.append(post.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    private static boolean isNumeric(String token) {
        return token.matches("-?\\d+");
    }

    private static boolean isOperator(String token) {
        return token.matches("[-+*/%$]");
    }

    public static void main(String[] args) {
        String infix = "11 $ 33 + 13 * 12 - ( 12 + 18 / 23 ) + 65";

        System.out.println("Infix: " + infix);
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
    }

}
