
public class BInfixToPrefixMain {
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

    public static String infixToPrefix(String infix) {
    	BInfixToPrefix pre = new BInfixToPrefix(30);
        StringBuilder prefix = new StringBuilder();

        String[] tokens = infix.split("\\s+");

       
        for (String token : tokens) {
            if (isNumeric(token)) {
            	prefix.append(token).append(" ");
            } else if (token.equals(")")) {
            	pre.push(token);
            } else if (token.equals("(")) {
                while (!pre.isEmpty() && !pre.peek().equals(")")) {
                    prefix.insert(0, pre.pop() + " ");
                }
                pre.pop();  
            } else if (isOperator(token)) {
                while (!pre.isEmpty() && prio(pre.peek().charAt(0)) >= prio(token.charAt(0)) && !pre.peek().equals(")")) {
                    prefix.insert(0, pre.pop() + " ");
                }
                pre.push(token);
            }
        }

        while (!pre.isEmpty()) {
            prefix.insert(0, pre.pop() + " ");
        }

        return prefix.toString().trim();
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
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix: " + prefix);

	}
}
