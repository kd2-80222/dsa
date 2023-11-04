
public class CPostfixMain {
	public static int calaculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;

		}
		return 0;
	}

	public static int postfixEvaluate(String postfix) {
		CPostfix post = new CPostfix(30);
		String[] tokens = postfix.split(" "); 

		for (String token : tokens) {
			if (token.trim().isEmpty()) {
				continue; 
			}

			if (isNumeric(token)) {
				int number = Integer.parseInt(token);
				post.push(number);
			} else if (token.length() == 1) {
				char operator = token.charAt(0); 
				int op2 = post.pop();
				int op1 = post.pop();
				int result = calaculate(op1, operator, op2);
				post.push(result);
			}
		}

		if (!post.isEmpty())
			return post.pop();
		return 0;
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+"); 
	}

	public static void main(String[] args) {
		String postfix = " 12 32 + 67 * 17 / 54 -";
		System.out.println("Postfix : " + postfix);
		int result1 = postfixEvaluate(postfix);
		System.out.println("Result :" + result1);
	}
}
